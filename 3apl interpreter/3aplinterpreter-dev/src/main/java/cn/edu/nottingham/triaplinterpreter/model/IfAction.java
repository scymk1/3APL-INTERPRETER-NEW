package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPTerm;
import java.io.StringBufferInputStream;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IfAction implements Action {

  private Wff wff;
  private Plan plan;
  private Plan elsePlan;

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("IF (");
    sb.append(wff.toString() + ") {");
    sb.append(plan.toString() + "}");
    if (elsePlan != null) {
      sb.append("ELSE {");
      sb.append(elsePlan.toString());
      sb.append("}");
    }
    return sb.toString();
  }
  @Override
  public void substitute(Hashtable variables) {
    wff.substitute(variables);
    if (plan != null) {
      plan.substitute(variables);
    }
    if (elsePlan != null) {
      plan.substitute(variables);
    }
  }

  @Override
  public void execute(AgentController controller, Agent agent) {
    JIPEngine engine = new JIPEngine();
    engine.reset();
    engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
    List<JIPTerm> solutions = Query.builder().wff(wff).trueLiteral(false).build().evaluate(engine);
    if (solutions.size() == 0 || solutions.stream().allMatch(Objects::isNull)) {
      if (elsePlan == null) {
        return;
      } else {
        elsePlan.execute(controller, agent);
      }
    } else {
      plan.execute(controller, agent);
    }
  }
}
