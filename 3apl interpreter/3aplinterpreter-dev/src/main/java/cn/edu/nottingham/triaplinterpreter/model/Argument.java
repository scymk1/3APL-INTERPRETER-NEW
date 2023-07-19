package cn.edu.nottingham.triaplinterpreter.model;

import com.ugos.jiprolog.engine.JIPVariable;
import java.io.Serializable;
import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Argument implements Serializable {

  private String name;
  private Atom atom;

  @Override
  public String toString() {
    if (atom != null) {
      return atom.toString();
    } else {
      return name;
    }
  }

  void substitute(Hashtable variables) {
    if (name != null) {
      if (variables.containsKey(name)) {
        name = (variables.get(name)).toString();
      }
    }
    if (atom != null) {
      atom.substitute(variables);
    }
  }
}
