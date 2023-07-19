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
public class PlanBase implements Serializable {

  private List<Plan> plans;

  public PlanBase() {
    plans = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join("\n",
        plans.stream()
            .map(Plan::toString)
            .collect(Collectors.toList()));
  }
}
