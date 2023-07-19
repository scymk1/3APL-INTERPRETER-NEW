package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.Hashtable;

public interface Wff extends Serializable {

  String toPrologString();

  void substitute(Hashtable variables);
}
