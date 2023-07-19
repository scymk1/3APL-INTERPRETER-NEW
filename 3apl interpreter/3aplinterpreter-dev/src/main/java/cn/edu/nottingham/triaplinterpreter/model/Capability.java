package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPTerm;
import java.io.Serializable;
import java.io.StringBufferInputStream;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Capability implements Serializable {

  private Query query;
  private Aatom aatom;
  private List<Literal> literals;

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (query != null) {
      sb.append("{" + query.toString() + "} ");
    }
    if (aatom != null) {
      sb.append(aatom.toString());
    }
    if (literals != null && !literals.isEmpty()) {
      sb.append("{" + literals.stream().map(Literal::toString).collect(Collectors.joining(",")) + "}");
    }
    return sb.toString();
  }


  public void substitute(Hashtable variables) {
    if (query != null) {
      query.substitute(variables);
    }
    if (literals != null && !literals.isEmpty()) {
      literals.forEach(l -> l.substitute(variables));
    }
  }

  public void execute(AgentController controller, Agent agent) {
    if (query != null) {
      JIPEngine engine = new JIPEngine();
      engine.reset();
      engine.consultStream(new StringBufferInputStream(agent.getBbase().toPrologString()), "beliefs");
      List<JIPTerm> solutions = query.evaluate(engine);
      if (solutions != null && solutions.size() > 0) {
        for (JIPTerm solution : solutions) {
          if (solution == null) {
            continue;
          }
          Hashtable variables = solution.getVariablesTable();
          if (literals != null && literals.size() > 0) {
            literals.forEach(l -> l.substitute(variables));
          }
          break;
        }
      } else {
        return;
      }
    }
    literals.forEach(l -> l.execute(controller, agent));
  }
}
