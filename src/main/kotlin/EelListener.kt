package org.eel

import org.eel.antlr.EelParser
import org.eel.antlr.EelParserBaseListener

class EelListener : EelParserBaseListener() {
    override fun enterProg(ctx: EelParser.ProgContext) {
        println("Prog entered: " + ctx.text);
    }

    override fun exitProg(ctx: EelParser.ProgContext) {
        println("Exited prog");
    }
}