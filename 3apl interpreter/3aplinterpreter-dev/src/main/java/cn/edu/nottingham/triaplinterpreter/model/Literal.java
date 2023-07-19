package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.io.Serializable;
import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Literal implements Serializable {

  private boolean not = false;
  private Atom atom;

  @Override
  public String toString() {
    if (not) {
      return "NOT " + atom.toString();
    } else {
      return atom.toString();
    }
  }

  public String toPrologString() {
    StringBuilder sb = new StringBuilder();
    if (not) {
      sb.append("\\+ ");
    }
    sb.append(atom.toPrologString());
    return sb.toString();
  }

  public void substitute(Hashtable variables) {
    atom.substitute(variables);
  }

  public void execute(AgentController agentController, Agent agent) {
    if (not) {
      Belief find = agent.getBbase().getBeliefs().stream()
          .filter(b -> b.getAtom().toString().equals(atom.toString()))
          .findAny()
          .orElse(null);
      if (find != null) {
        agent.getBbase().getBeliefs().remove(find);
      }
    } else {
      agent.getBbase().getBeliefs()
          .add(Belief.builder().atom(atom).build());
    }
  }
}
