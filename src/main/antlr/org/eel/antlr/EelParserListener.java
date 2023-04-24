// Generated from /Users/jacob/IdeaProjects/eelKotlin/src/main/resources/antlr/EelParser.g4 by ANTLR 4.12.0
package org.eel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EelParser}.
 */
public interface EelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EelParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EelParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EelParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#procedures}.
	 * @param ctx the parse tree
	 */
	void enterProcedures(EelParser.ProceduresContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#procedures}.
	 * @param ctx the parse tree
	 */
	void exitProcedures(EelParser.ProceduresContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#procecure}.
	 * @param ctx the parse tree
	 */
	void enterProcecure(EelParser.ProcecureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#procecure}.
	 * @param ctx the parse tree
	 */
	void exitProcecure(EelParser.ProcecureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(EelParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(EelParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(EelParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(EelParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EelParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EelParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EelParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EelParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(EelParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(EelParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(EelParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(EelParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperator(EelParser.BoolOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperator(EelParser.BoolOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void enterControlStructure(EelParser.ControlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#controlStructure}.
	 * @param ctx the parse tree
	 */
	void exitControlStructure(EelParser.ControlStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#selectiveControlStructure}.
	 * @param ctx the parse tree
	 */
	void enterSelectiveControlStructure(EelParser.SelectiveControlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#selectiveControlStructure}.
	 * @param ctx the parse tree
	 */
	void exitSelectiveControlStructure(EelParser.SelectiveControlStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#ifStructure}.
	 * @param ctx the parse tree
	 */
	void enterIfStructure(EelParser.IfStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#ifStructure}.
	 * @param ctx the parse tree
	 */
	void exitIfStructure(EelParser.IfStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(EelParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(EelParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#elseIfStructure}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStructure(EelParser.ElseIfStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#elseIfStructure}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStructure(EelParser.ElseIfStructureContext ctx);
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
	 * Enter a parse tree produced by {@link EelParser#iterativeControlStructure}.
	 * @param ctx the parse tree
	 */
	void enterIterativeControlStructure(EelParser.IterativeControlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#iterativeControlStructure}.
	 * @param ctx the parse tree
	 */
	void exitIterativeControlStructure(EelParser.IterativeControlStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#repeatStructure}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStructure(EelParser.RepeatStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#repeatStructure}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStructure(EelParser.RepeatStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EelParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EelParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#staticValue}.
	 * @param ctx the parse tree
	 */
	void enterStaticValue(EelParser.StaticValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#staticValue}.
	 * @param ctx the parse tree
	 */
	void exitStaticValue(EelParser.StaticValueContext ctx);
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
	 * Enter a parse tree produced by {@link EelParser#userValue}.
	 * @param ctx the parse tree
	 */
	void enterUserValue(EelParser.UserValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#userValue}.
	 * @param ctx the parse tree
	 */
	void exitUserValue(EelParser.UserValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void enterActualParameters(EelParser.ActualParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#actualParameters}.
	 * @param ctx the parse tree
	 */
	void exitActualParameters(EelParser.ActualParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EelParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(EelParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link EelParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(EelParser.MethodContext ctx);
}