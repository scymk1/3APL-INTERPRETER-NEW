package cn.edu.nottingham.triaplinterpreter.view;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import lombok.Data;

@Data
public class AgentListView extends JPanel {

  private final JTable agentTable;

  private final DefaultTableModel tableModel;

  private final Font font = new Font("Monaco", Font.PLAIN, 25);

  public AgentListView() {
    tableModel = new DefaultTableModel();
    tableModel.addColumn("Agent Name");
    tableModel.addColumn("Agent Status");
    agentTable = new JTable(tableModel);
    agentTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    agentTable.getTableHeader().setFont(font);
    agentTable.setFont(font);
    agentTable.setRowHeight(30);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(agentTable);
    this.add(sp);
  }
}
