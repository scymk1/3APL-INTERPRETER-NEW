package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Aatom implements Serializable {

  private String name;
  private List<Argument> args;

  void substitute(Hashtable variables) {
    if (args != null) {
      args.forEach(arg -> arg.substitute(variables));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name + "(");
    sb.append(args.stream().map(Argument::toString).collect(Collectors.joining(",")));
    sb.append(")");
    return sb.toString();
  }
}
