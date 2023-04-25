package org.eel

import org.antlr.v4.runtime.tree.TerminalNode
import org.eel.antlr.EelParser
import org.eel.antlr.EelParserBaseListener

class EelListener : EelParserBaseListener() {
    override fun enterProgram(ctx: EelParser.ProgramContext) {
        println("Prog entered:\n" + ctx.text)
    }

    override fun exitProgram(ctx: EelParser.ProgramContext) {
        println("Exited prog")
    }

    override fun visitTerminal(node: TerminalNode?) {
        super.visitTerminal(node)
    }

    override fun enterFunction(ctx: EelParser.FunctionContext?) {
        super.enterFunction(ctx)

        println("Function entered:\n" + ctx.toString())
    }
}