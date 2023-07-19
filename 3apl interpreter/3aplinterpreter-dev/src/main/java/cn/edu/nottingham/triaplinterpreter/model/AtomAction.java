package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AtomAction implements Action {

  private Atom atom;

  @Override
  public void substitute(Hashtable variables) {
    atom.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {

  }

  public String toString() {
    return atom.toString();
  }
}
