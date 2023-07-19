package cn.edu.nottingham.triaplinterpreter.view;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import lombok.Data;

@Data
public class AgentControlView extends JPanel {

  private final JButton createAgent;
  private final JButton startAgent;
  private final JButton stopAgent;
  private final JButton removeAgent;
  private final JButton checkStatus;

  private final JButton nextCycle;

  private final Font font = new Font("Monaco", Font.PLAIN, 25);

  public AgentControlView() {
    this.setLayout(new FlowLayout());
    createAgent = new JButton("Create Agent");
    createAgent.setFont(font);
    this.add(createAgent);
    startAgent = new JButton("Start Agent");
    startAgent.setFont(font);
    this.add(startAgent);
    stopAgent = new JButton("Stop Agent");
    stopAgent.setFont(font);
    this.add(stopAgent);
    removeAgent = new JButton("Remove Agent");
    removeAgent.setFont(font);
    this.add(removeAgent);
    checkStatus = new JButton("Check Status");
    checkStatus.setFont(font);
    this.add(checkStatus);
    nextCycle = new JButton("Next Cycle");
    nextCycle.setFont(font);
    this.add(nextCycle);
  }
}
