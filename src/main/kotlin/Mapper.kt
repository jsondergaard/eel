package org.eel

import org.eel.antlr.EelParser.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token

interface ParseTreeToAstMapper<in PTN : ParserRuleContext, out ASTN : Node> {
    fun map(parseTreeNode: PTN): ASTN
}

fun Token.startPoint() = Point(line, charPositionInLine)

fun Token.endPoint() = Point(line, charPositionInLine + (if (type == EOF) 0 else text.length))

fun ParserRuleContext.toPosition(considerPosition: Boolean) : Position? {
    return if (considerPosition) Position(start.startPoint(), stop.endPoint()) else null
}
fun EelFileContext.toAst(considerPosition: Boolean = false) : EelFile = EelFile(this.procedure().map { it.toAst(considerPosition) }, toPosition(considerPosition))

fun ProcedureContext.toAst(considerPosition: Boolean = false) : Procedure = Procedure(this.ID().text, this.line().map { it.statement().toAst(considerPosition) }, toPosition(considerPosition))

fun StatementContext.toAst(considerPosition: Boolean = false) : Statement = when (this) {
    is VarDeclarationStatementContext -> VarDeclaration(varDeclaration().assignment().ID().text, varDeclaration().assignment().expression().toAst(considerPosition), toPosition(considerPosition))
    is PrintStatementContext -> Print(print().expression().toAst(considerPosition), toPosition(considerPosition))
    is IfStructureContext -> IfStructure(ifStruct().expression().toAst(considerPosition), ifStruct().statement().toPosition(considerPosition))
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun ExpressionContext.toAst(considerPosition: Boolean = false) : Expression = when (this) {
    is BinaryOperationContext -> toAst(considerPosition)
    is IntLiteralContext -> IntLit(text, toPosition(considerPosition))
    is StringLiteralContext -> StringLit(text, toPosition(considerPosition))
    is VarReferenceContext -> VarReference(text, toPosition(considerPosition))
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun BinaryOperationContext.toAst(considerPosition: Boolean = false) : Expression = when (operator.text) {
    ">" -> GreatherThanExpression(left.toAst(considerPosition), right.toAst(considerPosition), toPosition(considerPosition))
    "<" -> LessThanExpression(left.toAst(considerPosition), right.toAst(considerPosition), toPosition(considerPosition))
    "+" -> SumExpression(left.toAst(considerPosition), right.toAst(considerPosition), toPosition(considerPosition))
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

class EelParseTreeToAstMapper : ParseTreeToAstMapper<StatementContext, Statement> {
    override fun map(parseTreeNode: StatementContext): Statement = parseTreeNode.toAst()
}