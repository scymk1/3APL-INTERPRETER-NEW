package cn.edu.nottingham.triaplinterpreter.model;

import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AndWff implements Wff {

  private Wff left;
  private Wff right;

  @Override
  public String toString() {
    return left.toString() + " AND " + right.toString();
  }

  @Override
  public String toPrologString() {
    return left.toPrologString() + " , " + right.toPrologString();
  }

  @Override
  public void substitute(Hashtable variables) {
    left.substitute(variables);
    right.substitute(variables);
  }
}
