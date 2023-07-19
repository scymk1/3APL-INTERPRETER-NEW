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
public class SendAction implements Action {

  private String v1;
  private String v2;
  private Atom atom;

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("SEND (");
    sb.append(v1);
    sb.append("," + v2);
    sb.append("," + atom.toString());
    sb.append(")");
    return sb.toString();
  }

  @Override
  public void substitute(Hashtable variables) {
    if (variables.containsKey(v1)) {
      v1 = variables.get(v1).toString();
    }
    atom.substitute(variables);
  }

  @Override
  public void execute(AgentController controller, Agent agent) {
    // send msg to target
    Message msg = Message.builder()
        .from(agent.getName())
        .to(v1)
        .level(v2)
        .content(atom.toString())
        .build();
    controller.getController().getAgentControllers().get(v1).getInputMessages().offer(msg);

    // record sent
    Argument to = Argument.builder().name(v1).build();
    Argument level = Argument.builder().name(v2).build();
    Argument atom = Argument.builder().atom(SerializationUtils.clone(this.atom)).build();
    Atom atom1 = Atom.builder()
        .name("sent")
        .args(List.of(new Argument[]{to, level, atom}))
        .build();
    Belief belief = Belief.builder()
        .atom(atom1)
        .build();
    agent.getBbase().getBeliefs().add(belief);
  }
}
