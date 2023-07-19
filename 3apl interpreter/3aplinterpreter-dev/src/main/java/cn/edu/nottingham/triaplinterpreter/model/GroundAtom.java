package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GroundAtom implements Serializable {

  private String name;
  private List<String> args = new ArrayList<>();

  @Override
  public String toString() {
    return name + "(" + String.join(",", args) + ")";
  }
}
