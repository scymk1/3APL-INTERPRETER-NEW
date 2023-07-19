package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Goal implements Serializable {

  private List<Atom> atoms;

  @Override
  public String toString() {
    return atoms.stream()
        .map(Atom::toString).collect(Collectors.joining(" AND "));
  }
}
