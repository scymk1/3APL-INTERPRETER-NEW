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
public class PlanRevisionRule implements Serializable {

  private List<RRule> rrules;

  public PlanRevisionRule() {
    rrules = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join("\n",
        rrules.stream()
            .map(RRule::toString)
            .collect(Collectors.toList()));
  }
}
