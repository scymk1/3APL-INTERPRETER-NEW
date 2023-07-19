package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message implements Serializable {

  private String from;
  private String to;
  private String level;
  private String content;

  public String toString() {
    return "received(" + from + "," + to + "," + level + "," + content + ")";
  }
}
