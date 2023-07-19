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
public class WhileAction implements Action {

  private Query query;
  private Plan plan;

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("WHILE (");
    sb.append(query);
    sb.append(") {");
    sb.append(plan+";");
    sb.append("}");
    return sb.toString();
  }
  @Override
  public void substitute(Hashtable variables) {
    query.substitute(variables);
    plan.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {
    while(true) {
      JIPEngine engine = new JIPEngine();
      engine.reset();
      engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
      List<JIPTerm> solutions = query.evaluate(engine);
      if (solutions.size() == 0 || solutions.stream().allMatch(Objects::isNull)) {
        break;
      }
      plan.execute(controller, agent);
    }
  }
}
