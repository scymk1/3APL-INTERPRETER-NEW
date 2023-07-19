// Generated from java-escape by ANTLR 4.11.1
package cn.edu.nottingham.triaplinterpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link APLGrammarParser}.
 */
public interface APLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(APLGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(APLGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#capabilities}.
	 * @param ctx the parse tree
	 */
	void enterCapabilities(APLGrammarParser.CapabilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#capabilities}.
	 * @param ctx the parse tree
	 */
	void exitCapabilities(APLGrammarParser.CapabilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#capability}.
	 * @param ctx the parse tree
	 */
	void enterCapability(APLGrammarParser.CapabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#capability}.
	 * @param ctx the parse tree
	 */
	void exitCapability(APLGrammarParser.CapabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#beliefs}.
	 * @param ctx the parse tree
	 */
	void enterBeliefs(APLGrammarParser.BeliefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#beliefs}.
	 * @param ctx the parse tree
	 */
	void exitBeliefs(APLGrammarParser.BeliefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#belief}.
	 * @param ctx the parse tree
	 */
	void enterBelief(APLGrammarParser.BeliefContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#belief}.
	 * @param ctx the parse tree
	 */
	void exitBelief(APLGrammarParser.BeliefContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#goals}.
	 * @param ctx the parse tree
	 */
	void enterGoals(APLGrammarParser.GoalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#goals}.
	 * @param ctx the parse tree
	 */
	void exitGoals(APLGrammarParser.GoalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(APLGrammarParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(APLGrammarParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#plans}.
	 * @param ctx the parse tree
	 */
	void enterPlans(APLGrammarParser.PlansContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#plans}.
	 * @param ctx the parse tree
	 */
	void exitPlans(APLGrammarParser.PlansContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(APLGrammarParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(APLGrammarParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aatomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterAatomAction(APLGrammarParser.AatomActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aatomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitAatomAction(APLGrammarParser.AatomActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sendAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterSendAction(APLGrammarParser.SendActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sendAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitSendAction(APLGrammarParser.SendActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code javaAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterJavaAction(APLGrammarParser.JavaActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code javaAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitJavaAction(APLGrammarParser.JavaActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wffAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterWffAction(APLGrammarParser.WffActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wffAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitWffAction(APLGrammarParser.WffActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterAtomAction(APLGrammarParser.AtomActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitAtomAction(APLGrammarParser.AtomActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterIfAction(APLGrammarParser.IfActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitIfAction(APLGrammarParser.IfActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void enterWhileAction(APLGrammarParser.WhileActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 */
	void exitWhileAction(APLGrammarParser.WhileActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#plant}.
	 * @param ctx the parse tree
	 */
	void enterPlant(APLGrammarParser.PlantContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#plant}.
	 * @param ctx the parse tree
	 */
	void exitPlant(APLGrammarParser.PlantContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#p_rules}.
	 * @param ctx the parse tree
	 */
	void enterP_rules(APLGrammarParser.P_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#p_rules}.
	 * @param ctx the parse tree
	 */
	void exitP_rules(APLGrammarParser.P_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#p_rule}.
	 * @param ctx the parse tree
	 */
	void enterP_rule(APLGrammarParser.P_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#p_rule}.
	 * @param ctx the parse tree
	 */
	void exitP_rule(APLGrammarParser.P_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#r_rules}.
	 * @param ctx the parse tree
	 */
	void enterR_rules(APLGrammarParser.R_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#r_rules}.
	 * @param ctx the parse tree
	 */
	void exitR_rules(APLGrammarParser.R_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void enterR_rule(APLGrammarParser.R_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void exitR_rule(APLGrammarParser.R_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(APLGrammarParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(APLGrammarParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(APLGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(APLGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void enterAndWff(APLGrammarParser.AndWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void exitAndWff(APLGrammarParser.AndWffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void enterLiteralWff(APLGrammarParser.LiteralWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void exitLiteralWff(APLGrammarParser.LiteralWffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void enterOrWff(APLGrammarParser.OrWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 */
	void exitOrWff(APLGrammarParser.OrWffContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(APLGrammarParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(APLGrammarParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#iv}.
	 * @param ctx the parse tree
	 */
	void enterIv(APLGrammarParser.IvContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#iv}.
	 * @param ctx the parse tree
	 */
	void exitIv(APLGrammarParser.IvContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(APLGrammarParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(APLGrammarParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(APLGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(APLGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(APLGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(APLGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(APLGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(APLGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#aatom}.
	 * @param ctx the parse tree
	 */
	void enterAatom(APLGrammarParser.AatomContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#aatom}.
	 * @param ctx the parse tree
	 */
	void exitAatom(APLGrammarParser.AatomContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#pvarval}.
	 * @param ctx the parse tree
	 */
	void enterPvarval(APLGrammarParser.PvarvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#pvarval}.
	 * @param ctx the parse tree
	 */
	void exitPvarval(APLGrammarParser.PvarvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#pvar}.
	 * @param ctx the parse tree
	 */
	void enterPvar(APLGrammarParser.PvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#pvar}.
	 * @param ctx the parse tree
	 */
	void exitPvar(APLGrammarParser.PvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(APLGrammarParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(APLGrammarParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link APLGrammarParser#pval}.
	 * @param ctx the parse tree
	 */
	void enterPval(APLGrammarParser.PvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link APLGrammarParser#pval}.
	 * @param ctx the parse tree
	 */
	void exitPval(APLGrammarParser.PvalContext ctx);
}