// Generated from c:/Users/okpat/Desktop/Laptop/coding/Project/Final-Shell-Script-Analyzer/ShellScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShellScriptParser}.
 */
public interface ShellScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ShellScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ShellScriptParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link ShellScriptParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(ShellScriptParser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(ShellScriptParser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void enterPipeline(ShellScriptParser.PipelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#pipeline}.
	 * @param ctx the parse tree
	 */
	void exitPipeline(ShellScriptParser.PipelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(ShellScriptParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(ShellScriptParser.CompoundStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ShellScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(ShellScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(ShellScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#testClause}.
	 * @param ctx the parse tree
	 */
	void enterTestClause(ShellScriptParser.TestClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#testClause}.
	 * @param ctx the parse tree
	 */
	void exitTestClause(ShellScriptParser.TestClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ShellScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ShellScriptParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link ShellScriptParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(ShellScriptParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(ShellScriptParser.ArrayAssignmentContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithmeticExpansion}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpansion(ShellScriptParser.ArithmeticExpansionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithmeticExpansion}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpansion(ShellScriptParser.ArithmeticExpansionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(ShellScriptParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(ShellScriptParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShellScriptParser#redirection}.
	 * @param ctx the parse tree
	 */
	void enterRedirection(ShellScriptParser.RedirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShellScriptParser#redirection}.
	 * @param ctx the parse tree
	 */
	void exitRedirection(ShellScriptParser.RedirectionContext ctx);
}