package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import com.ugos.jiprolog.engine.JIPVariable;
import java.util.Hashtable;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.SerializationUtils;

@Builder
@Data
public class AatomAction implements Action {

  private Aatom aatom;

  private Hashtable variables;

  @Override
  public void substitute(Hashtable variables) {
    this.variables = variables;
    aatom.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {
    // find capability
    Capability capability =
        agent.getCbase()
            .getCapabilities().stream()
            .filter(c -> c.getAatom().getName().equals(aatom.getName()))
            .findFirst()
            .orElse(null);
    // execute capability
    if (capability != null) {
      capability = SerializationUtils.clone(capability);
      List<Argument> catomArgs = capability.getAatom().getArgs();
      Hashtable<String, String> hashtable = new Hashtable<>();
      for (int i = 0; i < catomArgs.size(); i++) {
        hashtable.put(catomArgs.get(i).getName(), aatom.getArgs().get(i).getName());
      }
      capability.substitute(hashtable);
      capability.execute(controller, agent);
    }
  }

  public String toString() {
    return aatom.toString();
  }
}
