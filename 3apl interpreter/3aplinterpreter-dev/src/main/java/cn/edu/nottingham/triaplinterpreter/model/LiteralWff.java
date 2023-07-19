package cn.edu.nottingham.triaplinterpreter.model;

import java.util.Hashtable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LiteralWff implements Wff {

  private Literal literal;

  @Override
  public String toString() {
    return literal.toString();
  }

  @Override
  public String toPrologString() {
    return literal.toPrologString();
  }

  @Override
  public void substitute(Hashtable variables) {
    literal.substitute(variables);
  }
}
