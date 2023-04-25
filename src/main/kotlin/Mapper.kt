package org.eel

import org.eel.antlr.EelParser.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token

interface ParseTreeToAstMapper<in PTN : ParserRuleContext, out ASTN : Node> {
    fun map(parseTreeNode: PTN): ASTN
}
fun ProcedureContext.toAst(considerPosition: Boolean = false) : Program = Program(this.line().map { it.statement().toAst(considerPosition) }, toPosition(considerPosition))

fun Token.startPoint() = Point(line, charPositionInLine)

fun Token.endPoint() = Point(line, charPositionInLine + (if (type == EOF) 0 else text.length))

fun ParserRuleContext.toPosition(considerPosition: Boolean) : Position? {
    return if (considerPosition) Position(start.startPoint(), stop.endPoint()) else null
}

fun ProgramContext.toAst(considerPosition: Boolean = false) : Line = when (this) {
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun LineContext.toAst(considerPosition: Boolean = false) : Line = when (this) {
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

fun StatementContext.toAst(considerPosition: Boolean = false) : Statement = when (this) {
    /*is PrintStatementContext -> Print(print().expression().toAst(considerPosition), toPosition(considerPosition))*/
    else -> throw UnsupportedOperationException(this.javaClass.canonicalName)
}

class EelParseTreeToAstMapper : ParseTreeToAstMapper<LineContext, Line> {
    override fun map(parseTreeNode: LineContext): Line = parseTreeNode.toAst()
}