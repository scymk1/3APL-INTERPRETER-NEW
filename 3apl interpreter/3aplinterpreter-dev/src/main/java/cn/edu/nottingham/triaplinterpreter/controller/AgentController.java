package cn.edu.nottingham.triaplinterpreter.controller;

import cn.edu.nottingham.triaplinterpreter.model.Action;
import cn.edu.nottingham.triaplinterpreter.model.Agent;
import cn.edu.nottingham.triaplinterpreter.model.Argument;
import cn.edu.nottingham.triaplinterpreter.model.Atom;
import cn.edu.nottingham.triaplinterpreter.model.Belief;
import cn.edu.nottingham.triaplinterpreter.model.Goal;
import cn.edu.nottingham.triaplinterpreter.model.Message;
import cn.edu.nottingham.triaplinterpreter.model.PRule;
import cn.edu.nottingham.triaplinterpreter.model.Plan;
import cn.edu.nottingham.triaplinterpreter.model.RRule;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;
import java.io.StringBufferInputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

/**
 * Derivation cycle of an agent.
 */
@Data
public class AgentController implements Runnable {

  public static final String RUNNING = "RUNNING";
  public static final String STOPPED = "STOPPED";
  private MainController controller;
  private LinkedBlockingQueue<Message> inputMessages;
  private LinkedBlockingQueue<Message> outputMessages;
  private Agent agent;

  private AtomicInteger halt = new AtomicInteger(1);
  private volatile String status;

  private List<String> agentLog;

  public AgentController(Agent agent, MainController controller) {
    this.agent = agent;
    this.controller = controller;
    this.inputMessages = new LinkedBlockingQueue<>();
    this.agentLog = new ArrayList<>();
    status = STOPPED;
  }

  public void retrieveMessage() {
    Message msg = null;
    try {
      msg = inputMessages.take();
    } catch (InterruptedException e) {

    }
    agentLog.add("Received msg:" + msg.toString());
    // record received
    Argument from = Argument.builder().name(msg.getFrom()).build();
    Argument level = Argument.builder().name(msg.getLevel()).build();
    Argument content = Argument.builder()
        .atom(new ParseDriver().parseAtom(msg.getContent())).build();
    Atom atom1 = Atom.builder()
        .name("received")
        .args(List.of(new Argument[]{from, level, content}))
        .build();
    Belief belief = Belief.builder().atom(atom1).build();
    agent.getBbase().getBeliefs().add(belief);
  }

  private List<PRule> findPGRulesMatchedGoals() {
    List<PRule> result = new ArrayList<>();
    for (PRule iter : agent.getPgRule().getPrules()) {
      if (iter.getAtom() == null) {
        result.add(iter);
        continue;
      }
      for (Goal goal : agent.getGbase().getGoals()) {
        if (goal.toString().equals(iter.getAtom().toString())) {
          result.add(iter);
        }
      }
    }
    return result;
  }

  private List<Map.Entry<Hashtable, PRule>> findPGRulesMatchedBeliefs(List<PRule> rules) {
    List<Map.Entry<Hashtable, PRule>> results = new ArrayList<>();
    for (PRule iter : rules) {
      if (iter.getAtom() == null) {
        JIPEngine engine = new JIPEngine();
        engine.reset();
        engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
        List<JIPTerm> solutions = iter.getQuery().evaluate(engine);
        if (solutions != null && solutions.size() > 0) {
          // execute plan
          for (JIPTerm solution : solutions) {
            if (solution == null) {
              continue;
            }
            Hashtable<String, String> variables = new Hashtable<>();
            for (Object iter1:solution.getVariablesTable().keySet()) {
              variables.put((String)iter1,
                  ((JIPVariable)solution.getVariablesTable().get(iter1)).toString());
            }
            results.add(new AbstractMap.SimpleEntry<>(variables, iter));
          }
        }
        continue;
      }
      // check rule target in goals or not
      for (Goal goal : agent.getGbase().getGoals()) {
        if (iter.getAtom() == null || goal.toString().equals(iter.getAtom().toString())) {
          JIPEngine engine = new JIPEngine();
          engine.reset();
          engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
          List<JIPTerm> solutions = iter.getQuery().evaluate(engine);
          if (solutions != null && solutions.size() > 0) {
            // execute plan
            for (JIPTerm solution : solutions) {
              if (solution == null) {
                continue;
              }
              Hashtable variables = solution.getVariablesTable();
              results.add(new AbstractMap.SimpleEntry<>(variables, iter));
            }
          }
        }
      }
    }
    return results;
  }

  private void applyPGRule(Map.Entry<Hashtable, PRule> rule) {
    // remove goal
    Goal goal = null;
    for (Goal iter : agent.getGbase().getGoals()) {
      if (rule.getValue().getAtom().toString().equals(iter.toString())) {
        goal = iter;
      }
    }
    agent.getGbase().getGoals().remove(goal);
    // substitue plan
    Plan plan = SerializationUtils.clone(rule.getValue().getPlan());
    plan.substitute(rule.getKey());
    // add plan
    agent.getPbase().getPlans().add(plan);
  }

  private List<RRule> findPRRulesMatchedPlans() {
    List<RRule> result = new ArrayList<>();
    for (RRule iter : agent.getPrRule().getRrules()) {
      if (iter.getPlan1() == null) {
        result.add(iter);
        continue;
      }
      for (Plan plan : agent.getPbase().getPlans()) {
        if (plan.toString().equals(iter.getPlan1().toString())) {
          result.add(iter);
        }
      }
    }
    return result;
  }

  private RRule findPRRulesMatchedBeliefs(List<RRule> rules) {
    for (RRule iter : rules) {
      JIPEngine engine = new JIPEngine();
      engine.reset();
      engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
      List<JIPTerm> solutions = iter.getQuery().evaluate(engine);
      if (solutions != null && solutions.size() > 0 && solutions.stream().allMatch(Objects::nonNull)) {
        return iter;
      }
    }
    return null;
  }

  private void applyPRRule(RRule rule) {
    agent.getPbase().getPlans().add(rule.getPlan2());
  }

  private void executePlan(Plan plan) {
    for (Action action : plan.getActions()) {
      action.execute(this, agent);
    }
  }

  @Override
  public void run() {
    boolean rulesAppliedOrPlanExecuted = true;
    agentLog.add("Agent " + agent.getName() + " Start");
    while (true) {
      if (status.equals(STOPPED)) {
        try {
          Thread.sleep(1000);
          continue;
        } catch (InterruptedException e) {
        }
      }
      if(!halt.compareAndSet(1, 0)) {
        try {
          Thread.sleep(1000);
          continue;
        } catch (InterruptedException e) {
        }
      }
      agentLog.add("======Deliberation Cycle Start======");
      if (!rulesAppliedOrPlanExecuted) {
        // sleep until message arrives
        retrieveMessage();
      }
      rulesAppliedOrPlanExecuted = false;
      // Find PGrules matching goals
      agentLog.add("===Find plan goal rules matching goals===");
      List<PRule> pgRulesMatchedGoals = findPGRulesMatchedGoals();
      for (PRule iter:pgRulesMatchedGoals) {
        agentLog.add(iter.toString());
      }
      if (pgRulesMatchedGoals.size() > 0) {
        // Select PGrules matching beliefs
        agentLog.add("===Select plan goal rule matching beliefs===");
        List<Map.Entry<Hashtable, PRule>> pgRulesMatchedBeliefs = findPGRulesMatchedBeliefs(
            pgRulesMatchedGoals);
        if (pgRulesMatchedBeliefs.size() > 0) {
          agentLog.add("===Apply plan goal rule===");
          agentLog.add(pgRulesMatchedBeliefs.get(0).toString());
          // Apply one rule
          applyPGRule(pgRulesMatchedBeliefs.get(0));
          rulesAppliedOrPlanExecuted = true;
        }
      }

      // Find PRrules matching plans
      agentLog.add("===Find plan goal rules matching goals===");
      List<RRule> prRulesMatchedPlans = findPRRulesMatchedPlans();
      for (RRule iter:prRulesMatchedPlans) {
        agentLog.add(iter.toString());
      }
      if (prRulesMatchedPlans.size() > 0) {
        // Select PRrules matching beliefs
        agentLog.add("===Select plan revision rule matching beliefs===");
        RRule prRulesMatchedBeliefs =
            findPRRulesMatchedBeliefs(prRulesMatchedPlans);
        if (prRulesMatchedBeliefs != null) {
          agentLog.add("===Apply plan revision rule===");
          agentLog.add(prRulesMatchedBeliefs.toString());
          // Apply one rule
          applyPRRule(prRulesMatchedBeliefs);
          rulesAppliedOrPlanExecuted = true;
        }
      }
      // Select Plan
      Plan selectedPlan = null;
      if (!agent.getPbase().getPlans().isEmpty()) {
        selectedPlan = agent.getPbase().getPlans().remove(0);
      }
      if (selectedPlan != null) {
        agentLog.add("===Select plan to execute===");
        agentLog.add(selectedPlan.toString());
        // execute plan
        executePlan(selectedPlan);
        rulesAppliedOrPlanExecuted = true;
      }
      agentLog.add("======Deliberation Cycle End======");
    }
  }
}
