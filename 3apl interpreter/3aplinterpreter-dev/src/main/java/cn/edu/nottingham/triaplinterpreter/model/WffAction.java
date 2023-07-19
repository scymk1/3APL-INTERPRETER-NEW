package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WffAction implements Action {

  private Wff wff;

  public String toString() {
    return wff.toString();
  }

  @Override
  public void substitute(Hashtable variables) {
    wff.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {

  }
}
