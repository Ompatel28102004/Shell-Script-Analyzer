// Generated from c:/Users/okpat/Desktop/Laptop/coding/Project/Shell-Script-Analyzer/ShellScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShellScriptParser}.
 */
public interface ShellScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ShellScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ShellScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ShellScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ShellScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ShellScriptParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ShellScriptParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ShellScriptParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ShellScriptParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ShellScriptParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ShellScriptParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#echoStatement}.
	 * @param ctx the parse tree
	 */
	void enterEchoStatement(ShellScriptParser.EchoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#echoStatement}.
	 * @param ctx the parse tree
	 */
	void exitEchoStatement(ShellScriptParser.EchoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ShellScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ShellScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ShellScriptParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ShellScriptParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ShellScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ShellScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ShellScriptParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ShellScriptParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(ShellScriptParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(ShellScriptParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ShellScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ShellScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(ShellScriptParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(ShellScriptParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(ShellScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(ShellScriptParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithmeticTerm}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticTerm(ShellScriptParser.ArithmeticTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithmeticTerm}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticTerm(ShellScriptParser.ArithmeticTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithmeticFactor}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticFactor(ShellScriptParser.ArithmeticFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithmeticFactor}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticFactor(ShellScriptParser.ArithmeticFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ShellScriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ShellScriptParser.VariableContext ctx);
}