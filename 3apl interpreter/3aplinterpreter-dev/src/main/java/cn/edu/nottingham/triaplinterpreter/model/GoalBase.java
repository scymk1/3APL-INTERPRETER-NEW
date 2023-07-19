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
public class GoalBase implements Serializable {

  private List<Goal> goals;

  public GoalBase() {
    goals = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join("\n",
        goals.stream()
            .map(Goal::toString)
            .collect(Collectors.toList()));
  }
}
