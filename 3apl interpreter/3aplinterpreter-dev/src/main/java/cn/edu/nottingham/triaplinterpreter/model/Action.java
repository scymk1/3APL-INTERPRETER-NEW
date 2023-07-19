package cn.edu.nottingham.triaplinterpreter.model;

import cn.edu.nottingham.triaplinterpreter.controller.AgentController;
import java.io.Serializable;
import java.util.Hashtable;

public interface Action extends Serializable {

  void substitute(Hashtable variables);

  void execute(AgentController controller, Agent agent);
}
