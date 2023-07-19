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
public class PlanGoalRule implements Serializable {

  private List<PRule> prules;

  public PlanGoalRule() {
    prules = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join("\n",
        prules.stream()
            .map(PRule::toString)
            .collect(Collectors.toList()));
  }
}
