package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RRule implements Serializable {

  private Plan plan1;
  private Query query;
  private Plan plan2;
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(plan1.toString());
    sb.append(" <- ");
    sb.append(query.toString());
    sb.append(" | ");
    sb.append(" { " + plan2.toString() + " } ");
    return sb.toString();
  }
}
