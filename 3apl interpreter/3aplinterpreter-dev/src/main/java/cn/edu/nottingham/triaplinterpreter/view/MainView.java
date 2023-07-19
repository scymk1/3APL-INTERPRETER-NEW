package cn.edu.nottingham.triaplinterpreter.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import lombok.Data;

@Data
public class MainView {

  private final JFrame mainFrame;

  private final AgentListView agentListView;

  private final AgentControlView agentControlView;

  private final JMenuBar menus;

  private final JMenuItem createMenu;

  private final JMenuItem sendMsgMenu;

  private final JMenuItem exit;


  private final Font font = new Font("Monaco", Font.PLAIN, 25);

  public MainView() {
    mainFrame = new JFrame("3APL Interpreter");
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(800, 800);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.getContentPane().setLayout(new BorderLayout());
    agentListView = new AgentListView();
    agentControlView = new AgentControlView();
    mainFrame.getContentPane().add(agentListView, BorderLayout.NORTH);
    mainFrame.getContentPane().add(agentControlView, BorderLayout.CENTER);
    menus = new JMenuBar();
    menus.setFont(font);
    JMenu menu1 = new JMenu("Agent");
    menu1.setFont(font);
    createMenu = new JMenuItem("Create");
    createMenu.setFont(font);
    menu1.add(createMenu);
    sendMsgMenu = new JMenuItem("Send Msg");
    sendMsgMenu.setFont(font);
    menu1.add(sendMsgMenu);
    menus.add(menu1);
    exit = new JMenuItem("Exit");
    exit.setFont(font);
    menus.add(exit);
    mainFrame.setJMenuBar(menus);
    mainFrame.getContentPane().repaint();
    mainFrame.setVisible(true);
  }
}
