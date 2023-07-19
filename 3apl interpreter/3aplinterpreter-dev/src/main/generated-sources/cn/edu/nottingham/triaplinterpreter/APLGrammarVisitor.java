// Generated from java-escape by ANTLR 4.11.1
package cn.edu.nottingham.triaplinterpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link APLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface APLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(APLGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#capabilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapabilities(APLGrammarParser.CapabilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#capability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability(APLGrammarParser.CapabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#beliefs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefs(APLGrammarParser.BeliefsContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#belief}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelief(APLGrammarParser.BeliefContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#goals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoals(APLGrammarParser.GoalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(APLGrammarParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#plans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlans(APLGrammarParser.PlansContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan(APLGrammarParser.PlanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aatomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAatomAction(APLGrammarParser.AatomActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendAction(APLGrammarParser.SendActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code javaAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaAction(APLGrammarParser.JavaActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wffAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWffAction(APLGrammarParser.WffActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomAction(APLGrammarParser.AtomActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAction(APLGrammarParser.IfActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileAction}
	 * labeled alternative in {@link APLGrammarParser#basicaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileAction(APLGrammarParser.WhileActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#plant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlant(APLGrammarParser.PlantContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#p_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_rules(APLGrammarParser.P_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#p_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_rule(APLGrammarParser.P_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#r_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_rules(APLGrammarParser.R_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#r_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_rule(APLGrammarParser.R_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(APLGrammarParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(APLGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndWff(APLGrammarParser.AndWffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralWff(APLGrammarParser.LiteralWffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orWff}
	 * labeled alternative in {@link APLGrammarParser#wff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrWff(APLGrammarParser.OrWffContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(APLGrammarParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#iv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIv(APLGrammarParser.IvContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(APLGrammarParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(APLGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(APLGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(APLGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#aatom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAatom(APLGrammarParser.AatomContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#pvarval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPvarval(APLGrammarParser.PvarvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#pvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPvar(APLGrammarParser.PvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#pname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPname(APLGrammarParser.PnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link APLGrammarParser#pval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPval(APLGrammarParser.PvalContext ctx);
}