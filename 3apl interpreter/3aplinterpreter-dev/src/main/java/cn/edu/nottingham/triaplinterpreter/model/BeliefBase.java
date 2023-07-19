package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class BeliefBase implements Serializable {

  private List<Belief> beliefs = new ArrayList<>();

  public BeliefBase() {
    beliefs = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join(".\n",
        beliefs.stream()
            .map(Belief::toString)
            .collect(Collectors.toList()));
  }

  public String toPrologString() {
    return String.join(".\n",
        beliefs.stream()
            .map(Belief::toPrologString)
            .collect(Collectors.toList()));
  }
}
