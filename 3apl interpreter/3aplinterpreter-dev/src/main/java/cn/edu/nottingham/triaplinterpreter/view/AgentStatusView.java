package cn.edu.nottingham.triaplinterpreter.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import lombok.Data;

@Data
public class AgentStatusView extends JFrame {

  private final JMenuItem addGoal;
  private final JLabel nameLabel;

  private final JTextField agentName;

  private final JLabel beliefsLabel;

  private final JTextArea beliefs;

  private final JLabel capabilitiesLabel;

  private final JTextArea capabilities;

  private final JLabel goalsLabel;

  private final JTextArea goals;

  private final JLabel plansLabel;

  private final JTextArea plans;

  private final JLabel goalRulesLabel;

  private final JTextArea goalRules;

  private final JLabel revistionRulesLabel;

  private final JTextArea revisionRules;

  private final JTextArea deliberation;
  private final Font font = new Font("Monaco", Font.PLAIN, 25);

  public AgentStatusView() {
    this.setTitle("Agent Status");
    this.setSize(1600, 3200);
    this.setLocationRelativeTo(null);
    this.setLayout(new BorderLayout());
    JMenuBar menus = new JMenuBar();
    menus.setFont(font);
    addGoal = new JMenuItem("Add Goal");
    addGoal.setFont(font);
    menus.add(addGoal);
    this.setJMenuBar(menus);
    JPanel namePanel = new JPanel();
    namePanel.setLayout(new FlowLayout());
    // name
    nameLabel = new JLabel("Agent Name");
    nameLabel.setFont(font);
    agentName = new JTextField(30);
    agentName.setFont(font);
    agentName.setEditable(false);
    namePanel.add(nameLabel);
    namePanel.add(agentName);
    namePanel.setBackground(Color.GREEN);
    this.getContentPane().add(namePanel, BorderLayout.NORTH);

    JPanel contentPanel = new JPanel();
    contentPanel.setLayout(new GridLayout(0, 3));
    // beliefs
    beliefsLabel = new JLabel("Belief Base");
    beliefsLabel.setFont(font);
    beliefs = new JTextArea(5, 30);
    beliefs.setFont(font);
    beliefs.setEditable(false);
    beliefs.setLineWrap(true);
    beliefs.setWrapStyleWord(true);
    JScrollPane scroll = new JScrollPane(beliefs);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel beliefPanel = new JPanel();
    beliefPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    beliefPanel.setLayout(new BorderLayout());
    beliefPanel.add(beliefsLabel, BorderLayout.NORTH);
    beliefPanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(beliefPanel);
    this.getContentPane().add(contentPanel, BorderLayout.CENTER);
    // capabilities
    capabilitiesLabel = new JLabel("Capabilities");
    capabilitiesLabel.setFont(font);
    capabilities = new JTextArea(5, 30);
    capabilities.setFont(font);
    capabilities.setEditable(false);
    capabilities.setLineWrap(true);
    capabilities.setWrapStyleWord(true);
    scroll = new JScrollPane(capabilities);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel capabilityPanel = new JPanel();
    capabilityPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    capabilityPanel.setLayout(new BorderLayout());
    capabilityPanel.add(capabilitiesLabel, BorderLayout.NORTH);
    capabilityPanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(capabilityPanel);
    // goals
    goalsLabel = new JLabel("Goal Base");
    goalsLabel.setFont(font);
    goals = new JTextArea(5, 30);
    goals.setFont(font);
    goals.setEditable(false);
    goals.setLineWrap(true);
    goals.setWrapStyleWord(true);
    scroll = new JScrollPane(goals);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel goalPanel = new JPanel();
    goalPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    goalPanel.setLayout(new BorderLayout());
    goalPanel.add(goalsLabel, BorderLayout.NORTH);
    goalPanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(goalPanel);
    // plans
    plansLabel = new JLabel("Plan Base");
    plansLabel.setFont(font);
    plans = new JTextArea(5, 30);
    plans.setFont(font);
    plans.setEditable(false);
    plans.setLineWrap(true);
    plans.setWrapStyleWord(true);
    scroll = new JScrollPane(plans);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel planPanel = new JPanel();
    planPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    planPanel.setLayout(new BorderLayout());
    planPanel.add(plansLabel, BorderLayout.NORTH);
    planPanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(planPanel);
    // goal rules
    goalRulesLabel = new JLabel("Plan Goal Rules");
    goalRulesLabel.setFont(font);
    goalRules = new JTextArea(5, 30);
    goalRules.setFont(font);
    goalRules.setEditable(false);
    goalRules.setLineWrap(true);
    goalRules.setWrapStyleWord(true);
    scroll = new JScrollPane(goalRules);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel goalRulePanel = new JPanel();
    goalRulePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    goalRulePanel.setLayout(new BorderLayout());
    goalRulePanel.add(goalRulesLabel, BorderLayout.NORTH);
    goalRulePanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(goalRulePanel);
    // revision rules
    revistionRulesLabel = new JLabel("Plan Revision Rules");
    revistionRulesLabel.setFont(font);
    revisionRules = new JTextArea(5, 30);
    revisionRules.setFont(font);
    revisionRules.setEditable(false);
    revisionRules.setLineWrap(true);
    revisionRules.setWrapStyleWord(true);
    scroll = new JScrollPane(revisionRules);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel revisionRulePanel = new JPanel();
    revisionRulePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    revisionRulePanel.setLayout(new BorderLayout());
    revisionRulePanel.add(revistionRulesLabel, BorderLayout.NORTH);
    revisionRulePanel.add(scroll, BorderLayout.CENTER);
    contentPanel.add(revisionRulePanel);

    // information area
    JLabel deliberationLabel = new JLabel("Deliberation Log");
    deliberationLabel.setFont(font);
    deliberation = new JTextArea(10, 60);
    deliberation.setFont(font);
    deliberation.setEditable(false);
    deliberation.setLineWrap(true);
    deliberation.setWrapStyleWord(true);
    scroll = new JScrollPane(deliberation);
    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel deliberationPanel = new JPanel();
    deliberationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    deliberationPanel.setLayout(new BorderLayout());
    deliberationPanel.add(deliberationLabel, BorderLayout.NORTH);
    deliberationPanel.add(scroll, BorderLayout.CENTER);
    this.getContentPane().add(deliberationPanel, BorderLayout.SOUTH);
    this.setVisible(true);
  }
}
