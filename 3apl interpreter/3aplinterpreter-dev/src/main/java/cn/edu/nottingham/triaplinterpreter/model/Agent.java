package cn.edu.nottingham.triaplinterpreter.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * Agent's model to store states and rules of agent.
 */
@Builder
@Data
public class Agent implements Serializable {

  private String name;
  private String load;
  private int state;
  private BeliefBase bbase;
  private CapbilityBase cbase;
  private GoalBase gbase;
  private PlanBase pbase;
  private PlanGoalRule pgRule;
  private PlanRevisionRule prRule;
}
