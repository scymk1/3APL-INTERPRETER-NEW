package cn.edu.nottingham.triaplinterpreter.controller;

import cn.edu.nottingham.triaplinterpreter.model.Agent;
import cn.edu.nottingham.triaplinterpreter.model.Goal;
import cn.edu.nottingham.triaplinterpreter.model.Message;
import cn.edu.nottingham.triaplinterpreter.view.AgentStatusView;
import cn.edu.nottingham.triaplinterpreter.view.MainView;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import lombok.Data;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Main thread to send and receive msg and monitor applicatioin status.
 */
@Data
public class MainController {

  private MainView view;

  private Map<String, AgentController> agentControllers;

  private ExecutorService pool = Executors.newFixedThreadPool(5);

  public MainController() {
    view = new MainView();
    agentControllers = new Hashtable<>();
  }

  public void start() {
    // bind create button
    view.getAgentControlView().getCreateAgent().addActionListener(this::onCreateAgent);
    view.getCreateMenu().addActionListener(this::onCreateAgent);
    // check status view
    view.getAgentControlView().getCheckStatus().addActionListener(this::onCheckStatus);
    // start
    view.getAgentControlView().getStartAgent().addActionListener(this::onStart);
    // stop
    view.getAgentControlView().getStopAgent().addActionListener(this::onStop);
    // remove
    view.getAgentControlView().getRemoveAgent().addActionListener(this::onRemove);
    // exit
    view.getExit().addActionListener(this::onExit);
    // send msg
    view.getSendMsgMenu().addActionListener(this::onSendMsg);
    // next cycle
    view.getAgentControlView().getNextCycle().addActionListener(this::onNextCycle);
  }

  public void onCreateAgent(ActionEvent e) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    int result = fileChooser.showOpenDialog(view.getMainFrame());
    if (result == JFileChooser.APPROVE_OPTION) {
      File selectedFile = fileChooser.getSelectedFile();
      ParseDriver parseDriver = new ParseDriver();
      try {
        Agent agent = parseDriver.parseAgent(new ANTLRFileStream(selectedFile.getAbsolutePath()));
        AgentController agentController = new AgentController(agent, this);
        agentControllers.put(agent.getName(), agentController);
        refreshAgentList();
        new Thread(agentController).start();
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(view.getMainFrame(),
            "Can't open file", "Alert", JOptionPane.INFORMATION_MESSAGE);
      } catch (ParseCancellationException ex) {
        JOptionPane.showMessageDialog(view.getMainFrame(),
            "Parse failed: " + ex.getMessage(), "Alert", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }

  private void refreshAgentList() {
    int rowCount = view.getAgentListView().getTableModel().getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
      view.getAgentListView().getTableModel().removeRow(i);
    }
    for (Map.Entry<String, AgentController> iter : agentControllers.entrySet()) {
      view.getAgentListView()
          .getTableModel()
          .addRow(new Object[]{iter.getKey(), iter.getValue().getStatus()});
    }
  }

  private void onCheckStatus(ActionEvent e) {
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String agentName = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    AgentStatusView statusView = new AgentStatusView();
    statusView.getAgentName().setText(agentName);
    statusView.getCapabilities()
        .setText(agentControllers.get(agentName).getAgent().getCbase().toString());
    statusView.getBeliefs()
        .setText(agentControllers.get(agentName).getAgent().getBbase().toString());
    statusView.getGoals().setText(agentControllers.get(agentName).getAgent().getGbase().toString());
    statusView.getPlans().setText(agentControllers.get(agentName).getAgent().getPbase().toString());
    statusView.getGoalRules()
        .setText(agentControllers.get(agentName).getAgent().getPgRule().toString());
    statusView.getRevisionRules()
        .setText(agentControllers.get(agentName).getAgent().getPrRule().toString());
    statusView.getDeliberation().setText("");
    for (String line:agentControllers.get(agentName).getAgentLog()) {
      statusView.getDeliberation().append(line + System.lineSeparator());
    }
    statusView.getAddGoal().addActionListener(this::onAddGoal);
    statusView.repaint();
    statusView.validate();
  }

  private void onStart(ActionEvent e) {
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String name = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    agentControllers.get(name).setStatus(AgentController.RUNNING);
    refreshAgentList();
  }

  private void onStop(ActionEvent e) {
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String name = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    agentControllers.get(name).setStatus(AgentController.STOPPED);
    refreshAgentList();
  }

  private void showAlert() {
    JOptionPane.showMessageDialog(view.getMainFrame(),
        "Please select an agent", "Alert", JOptionPane.INFORMATION_MESSAGE);
  }

  private void onRemove(ActionEvent e) {
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String name = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    agentControllers.remove(name);
    refreshAgentList();
  }

  private void onExit(ActionEvent e) {
    view.getMainFrame().dispose();
  }

  private void onAddGoal(ActionEvent e) {
    String input = JOptionPane.showInputDialog("Please enter goal");
    Goal goal = new ParseDriver().parseGoal(input);
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String agentName = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    agentControllers.get(agentName).getAgent().getGbase().getGoals().add(goal);
  }

  private void onSendMsg(ActionEvent e) {
    Object[] possibleValues = agentControllers.keySet().toArray(new String[0]);
    Object selectedValue =
        JOptionPane.showInputDialog(null, "Choose one","Input",JOptionPane.INFORMATION_MESSAGE, null, possibleValues,possibleValues[0]);

    String input = JOptionPane.showInputDialog("Please enter msg");
    Message msg = Message.builder()
        .from("CUSTOM")
        .to(String.valueOf(selectedValue))
        .content(input)
        .level("inform")
        .build();
    agentControllers.get(selectedValue).getInputMessages().add(msg);
  }

  private void onNextCycle(ActionEvent e) {
    int row = view.getAgentListView().getAgentTable().getSelectedRow();
    if (row == -1) {
      showAlert();
      return;
    }
    String agentName = (String) view.getAgentListView().getAgentTable().getValueAt(row, 0);
    agentControllers.get(agentName).getHalt().set(1);
  }
}
