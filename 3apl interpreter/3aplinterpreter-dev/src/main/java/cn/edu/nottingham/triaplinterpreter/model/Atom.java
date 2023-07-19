package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Atom implements Serializable {

  private String name;
  private List<Argument> args;

  @Override
  public String toString() {
    return name + "(" +
        String.join(",",
            args.stream().map(Argument::toString).collect(Collectors.toList())) + ")";
  }

  public String toPrologString() {
    if (args.isEmpty()) {
      return name;
    } else {
      return  toString();
    }
  }

  void substitute(Hashtable variables) {
    if (args != null) {
      args.forEach(arg -> arg.substitute(variables));
    }
  }
}
