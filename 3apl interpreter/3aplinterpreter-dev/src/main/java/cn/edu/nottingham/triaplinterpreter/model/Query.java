package cn.edu.nottingham.triaplinterpreter.model;

import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Query implements Serializable {

  private Wff wff;
  private boolean trueLiteral;

  public String toString() {
    if (trueLiteral) {
      return "TRUE";
    } else {
      return wff.toString();
    }
  }

  public List<JIPTerm> evaluate(JIPEngine engine) {
    if (trueLiteral) {
      return null;
    } else {
      JIPQuery query = engine.openSynchronousQuery(wff.toPrologString());
      List<JIPTerm> solutions = new ArrayList<>();
      while (query.hasMoreChoicePoints()) {
        JIPTerm solution = query.nextSolution();
        solutions.add(solution);
      }
      return solutions;
    }
  }

  public void substitute(Hashtable variables) {
    if (wff != null) {
      wff.substitute(variables);
    }
  }
}
