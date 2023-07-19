package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Plan implements Serializable {

  private List<Action> actions;

  public void substitute(Hashtable variables) {
    for (Action iter : actions) {
      iter.substitute(variables);
    }
  }

  public String toString() {
    return actions.stream().map(a -> a.toString()).collect(Collectors.joining(";"));
  }

  public void execute(AgentController agentController, Agent agent) {
    actions.forEach(a -> a.execute(agentController, agent));
  }
}
