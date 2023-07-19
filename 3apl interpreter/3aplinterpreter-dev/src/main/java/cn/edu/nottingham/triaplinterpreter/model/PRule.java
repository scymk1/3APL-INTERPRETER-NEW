package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PRule implements Serializable {

  private Atom atom;
  private Query query;
  private Plan plan;

  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (atom != null) {
      sb.append(atom.toString());
    }
    sb.append(" <- ");
    sb.append(query);
    sb.append(" | ");
    sb.append("{" + plan.toString() + "}");
    return sb.toString();
  }
}
