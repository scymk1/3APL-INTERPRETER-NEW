package cn.edu.nottingham.triaplinterpreter.controller;

import cn.edu.nottingham.triaplinterpreter.APLGrammarBaseVisitor;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.AatomActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.AatomContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.AndWffContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.ArgumentContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.AtomActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.AtomContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.BeliefContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.BeliefsContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.CapabilitiesContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.CapabilityContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.GoalContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.GoalsContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.IfActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.JavaActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.LiteralContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.LiteralWffContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.OrWffContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.P_ruleContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.P_rulesContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.PlanContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.PlansContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.PlantContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.ProgramContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.QueryContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.R_ruleContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.R_rulesContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.SendActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.WffActionContext;
import cn.edu.nottingham.triaplinterpreter.APLGrammarParser.WhileActionContext;
import cn.edu.nottingham.triaplinterpreter.model.Aatom;
import cn.edu.nottingham.triaplinterpreter.model.AatomAction;
import cn.edu.nottingham.triaplinterpreter.model.Action;
import cn.edu.nottingham.triaplinterpreter.model.Agent;
import cn.edu.nottingham.triaplinterpreter.model.AndWff;
import cn.edu.nottingham.triaplinterpreter.model.Argument;
import cn.edu.nottingham.triaplinterpreter.model.Atom;
import cn.edu.nottingham.triaplinterpreter.model.AtomAction;
import cn.edu.nottingham.triaplinterpreter.model.Belief;
import cn.edu.nottingham.triaplinterpreter.model.BeliefBase;
import cn.edu.nottingham.triaplinterpreter.model.Capability;
import cn.edu.nottingham.triaplinterpreter.model.CapbilityBase;
import cn.edu.nottingham.triaplinterpreter.model.Goal;
import cn.edu.nottingham.triaplinterpreter.model.GoalBase;
import cn.edu.nottingham.triaplinterpreter.model.IfAction;
import cn.edu.nottingham.triaplinterpreter.model.JavaAction;
import cn.edu.nottingham.triaplinterpreter.model.Literal;
import cn.edu.nottingham.triaplinterpreter.model.LiteralWff;
import cn.edu.nottingham.triaplinterpreter.model.PRule;
import cn.edu.nottingham.triaplinterpreter.model.Plan;
import cn.edu.nottingham.triaplinterpreter.model.PlanBase;
import cn.edu.nottingham.triaplinterpreter.model.PlanGoalRule;
import cn.edu.nottingham.triaplinterpreter.model.PlanRevisionRule;
import cn.edu.nottingham.triaplinterpreter.model.Query;
import cn.edu.nottingham.triaplinterpreter.model.RRule;
import cn.edu.nottingham.triaplinterpreter.model.SendAction;
import cn.edu.nottingham.triaplinterpreter.model.Wff;
import cn.edu.nottingham.triaplinterpreter.model.WffAction;
import cn.edu.nottingham.triaplinterpreter.model.WhileAction;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgentBuilder extends APLGrammarBaseVisitor {

  @Override
  public Agent visitProgram(ProgramContext ctx) {
    Agent ret = Agent.builder().name(ctx.ident(0).getText()).build();
    ret.setName(ret.getName().substring(1, ret.getName().length() - 1));
    if (ctx.ident().size() > 1) {
      ret.setLoad(ctx.ident(1).getText());
    }
    if (ctx.capabilities() != null) {
      ret.setCbase(this.visitCapabilities(ctx.capabilities()));
    } else {
      ret.setCbase(new CapbilityBase());
    }
    if (ctx.beliefs() != null) {
      ret.setBbase(this.visitBeliefs(ctx.beliefs()));
    } else {
      ret.setBbase(new BeliefBase());
    }
    if (ctx.goals() != null) {
      ret.setGbase(this.visitGoals(ctx.goals()));
    } else {
      ret.setGbase(new GoalBase());
    }
    if (ctx.plans() != null) {
      ret.setPbase(this.visitPlans(ctx.plans()));
    } else {
      ret.setPbase(new PlanBase());
    }
    if (ctx.p_rules() != null) {
      ret.setPgRule(this.visitP_rules(ctx.p_rules()));
    } else {
      ret.setPgRule(new PlanGoalRule());
    }
    if (ctx.r_rules() != null) {
      ret.setPrRule(this.visitR_rules(ctx.r_rules()));
    } else {
      ret.setPrRule(new PlanRevisionRule());
    }
    return ret;
  }

  @Override
  public CapbilityBase visitCapabilities(CapabilitiesContext ctx) {
    List<Capability> capabilities = (List<Capability>) ctx.capability().stream()
        .map(this::visitCapability)
        .collect(Collectors.toList());
    return CapbilityBase.builder().capabilities(capabilities).build();
  }

  @Override
  public Capability visitCapability(CapabilityContext ctx) {
    return Capability.builder()
        .query(visitQuery(ctx.query()))
        .aatom(visitAatom(ctx.aatom()))
        .literals(
            ctx.literals().literal().stream()
                .map(this::visitLiteral)
                .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Query visitQuery(QueryContext ctx) {
    Query query = Query.builder().build();
    if (ctx.TRUE() != null) {
      query.setTrueLiteral(true);
    } else {
      query.setWff((Wff) ctx.wff().accept(this));
    }
    return query;
  }

  @Override
  public LiteralWff visitLiteralWff(LiteralWffContext ctx) {
    return LiteralWff.builder()
        .literal(visitLiteral(ctx.literal()))
        .build();
  }

  @Override
  public AndWff visitAndWff(AndWffContext ctx) {
    return AndWff.builder()
        .left((Wff) ctx.wff(0).accept(this))
        .right((Wff) ctx.wff(1).accept(this))
        .build();
  }

  @Override
  public Object visitOrWff(OrWffContext ctx) {
    return AndWff.builder()
        .left((Wff) ctx.wff(0).accept(this))
        .right((Wff) ctx.wff(1).accept(this))
        .build();
  }

  @Override
  public Aatom visitAatom(AatomContext ctx) {
    return Aatom.builder()
        .name(ctx.pvar().getText())
        .args(
            ctx.argument().stream()
                .map(this::visitArgument)
                .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Literal visitLiteral(LiteralContext ctx) {
    Literal literal = Literal.builder().build();
    if (ctx.NOT() != null) {
      literal.setNot(true);
    } else {
      literal.setNot(false);
    }
    literal.setAtom(visitAtom(ctx.atom()));
    return literal;
  }

  @Override
  public BeliefBase visitBeliefs(BeliefsContext ctx) {
    return BeliefBase.builder()
        .beliefs(ctx.belief().stream()
            .map(this::visitBelief)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Belief visitBelief(BeliefContext ctx) {
    return Belief.builder()
        .atom(visitAtom(ctx.atom()))
        .literals(ctx.literals() == null ? null :
            ctx.literals().literal().stream()
                .map(this::visitLiteral)
                .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Atom visitAtom(AtomContext ctx) {
    return Atom.builder()
        .name(ctx.pname().getText())
        .args(
            ctx.argument().stream()
                .map(this::visitArgument)
                .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Argument visitArgument(ArgumentContext ctx) {
    if (ctx.atom() != null) {
      return Argument.builder().atom(visitAtom(ctx.atom())).build();
    } else {
      return Argument.builder().name(ctx.pvarval().getText()).build();
    }
  }

  @Override
  public GoalBase visitGoals(GoalsContext ctx) {
    return GoalBase.builder()
        .goals(ctx.goal().stream()
            .map(this::visitGoal)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Goal visitGoal(GoalContext ctx) {
    return Goal.builder()
        .atoms(ctx.atom().stream()
            .map(this::visitAtom)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public PlanBase visitPlans(PlansContext ctx) {
    return PlanBase.builder()
        .plans(ctx.plan().stream()
            .map(this::visitPlan)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public Plan visitPlan(PlanContext ctx) {
    Plan plan = Plan.builder().build();
    plan.setActions(new ArrayList<>());
    plan.getActions().add((Action) ctx.basicaction().accept(this));
    if (ctx.plant() != null) {
      List<Action> tmp = ctx.plant().stream()
          .map(this::visitPlant)
          .flatMap(p -> p.getActions().stream())
          .collect(Collectors.toList());
      plan.getActions().addAll(tmp);
    }
    return plan;
  }

  @Override
  public Plan visitPlant(PlantContext ctx) {
    return visitPlan(ctx.plan());
  }

  @Override
  public AatomAction visitAatomAction(AatomActionContext ctx) {
    return AatomAction.builder()
        .aatom(visitAatom(ctx.aatom()))
        .build();
  }

  @Override
  public SendAction visitSendAction(SendActionContext ctx) {
    return SendAction.builder()
        .v1(ctx.iv(0).getText())
        .v2(ctx.iv(1).getText())
        .atom(visitAtom(ctx.atom()))
        .build();
  }

  @Override
  public JavaAction visitJavaAction(JavaActionContext ctx) {
    return JavaAction.builder()
        .id(ctx.ident().getText())
        .atom(visitAtom(ctx.atom()))
        .var(ctx.var().getText())
        .build();
  }

  @Override
  public WffAction visitWffAction(WffActionContext ctx) {
    return WffAction.builder()
        .wff((Wff) ctx.wff().accept(this))
        .build();
  }

  @Override
  public AtomAction visitAtomAction(AtomActionContext ctx) {
    return AtomAction.builder()
        .atom(visitAtom(ctx.atom()))
        .build();
  }

  @Override
  public IfAction visitIfAction(IfActionContext ctx) {
    IfAction ifAction = IfAction.builder()
        .wff((Wff) ctx.wff().accept(this))
        .plan(visitPlan(ctx.plan(0)))
        .build();
    if (ctx.ELSE() != null) {
      ifAction.setElsePlan(visitPlan(ctx.plan(1)));
    }
    return ifAction;
  }

  @Override
  public WhileAction visitWhileAction(WhileActionContext ctx) {
    return WhileAction.builder()
        .query(visitQuery(ctx.query()))
        .plan(visitPlan(ctx.plan()))
        .build();
  }

  @Override
  public PlanGoalRule visitP_rules(P_rulesContext ctx) {
    return PlanGoalRule.builder()
        .prules(ctx.p_rule().stream()
            .map(this::visitP_rule)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public PRule visitP_rule(P_ruleContext ctx) {
    PRule pRule = PRule.builder()
        .query(visitQuery(ctx.query()))
        .plan(visitPlan(ctx.plan()))
        .build();
    if (ctx.atom() != null) {
      pRule.setAtom(visitAtom(ctx.atom()));
    }
    return pRule;
  }

  @Override
  public PlanRevisionRule visitR_rules(R_rulesContext ctx) {
    return PlanRevisionRule.builder()
        .rrules(ctx.r_rule().stream()
            .map(this::visitR_rule)
            .collect(Collectors.toList()))
        .build();
  }

  @Override
  public RRule visitR_rule(R_ruleContext ctx) {
    return RRule.builder()
        .plan1(visitPlan(ctx.plan(0)))
        .query(visitQuery(ctx.query()))
        .plan2(visitPlan(ctx.plan(1)))
        .build();
  }
}
