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
public class CapbilityBase implements Serializable {

  List<Capability> capabilities;

  public CapbilityBase() {
    capabilities = new ArrayList<>();
  }

  @Override
  public String toString() {
    return String.join("\n",
        capabilities.stream()
            .map(Capability::toString)
            .collect(Collectors.toList()));
  }
}
