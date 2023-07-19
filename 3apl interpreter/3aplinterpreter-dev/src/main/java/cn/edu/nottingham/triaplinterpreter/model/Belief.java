package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Belief implements Serializable {

  private Atom atom;
  private List<Literal> literals;

  @Override
  public String toString() {
    if (literals != null) {
      return atom.toString() + ":-" +
          String.join(",", literals.stream()
              .map(Literal::toString)
              .collect(Collectors.toList()));
    } else {
      return atom.toString();
    }
  }

  public String toPrologString() {
    if (literals != null) {
      return atom.toPrologString() + ":-" +
          String.join(",", literals.stream()
              .map(Literal::toString)
              .collect(Collectors.toList()));
    } else {
      return atom.toPrologString();
    }
  }
}
