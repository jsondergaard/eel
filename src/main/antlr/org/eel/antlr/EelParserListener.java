// Generated from /Users/jacob/IdeaProjects/eel/src/main/resources/antlr/EelParser.g4 by ANTLR 4.12.0
package org.eel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EelParser}.
 */
public interface EelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EelParser#eelFile}.
	 * @param ctx the parse tree
	 */
	void enterEelFile(EelParser.EelFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#eelFile}.
	 * @param ctx the parse tree
	 */
	void exitEelFile(EelParser.EelFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(EelParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(EelParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(EelParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(EelParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(EelParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(EelParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(EelParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(EelParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(EelParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(EelParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(EelParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(EelParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStructure}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStructure(EelParser.IfStructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStructure}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStructure(EelParser.IfStructureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(EelParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(EelParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(EelParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(EelParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EelParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(EelParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(EelParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(EelParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(EelParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(EelParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(EelParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(EelParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(EelParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(EelParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(EelParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(EelParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(EelParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(EelParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(EelParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(EelParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(EelParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#ifStruct}.
	 * @param ctx the parse tree
	 */
	void enterIfStruct(EelParser.IfStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#ifStruct}.
	 * @param ctx the parse tree
	 */
	void exitIfStruct(EelParser.IfStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#elseStructure}.
	 * @param ctx the parse tree
	 */
	void enterElseStructure(EelParser.ElseStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#elseStructure}.
	 * @param ctx the parse tree
	 */
	void exitElseStructure(EelParser.ElseStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(EelParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(EelParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EelParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EelParser.PrintContext ctx);
}