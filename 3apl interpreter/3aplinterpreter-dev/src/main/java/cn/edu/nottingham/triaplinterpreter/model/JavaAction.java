package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JavaAction implements Action {

  private String id;
  private Atom atom;
  private String var;

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("JAVA (");
    sb.append(id);
    sb.append("," + atom.toString());
    sb.append("," + var);
    sb.append(")");
    return sb.toString();
  }

  @Override
  public void substitute(Hashtable variables) {
    if (variables.contains(var)) {
      var = (String) variables.get(var);
    }
    atom.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {

  }
}
