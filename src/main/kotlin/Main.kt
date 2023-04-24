package org.eel

import org.eel.antlr.EelLexer
import org.eel.antlr.EelParser
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.*
import java.io.FileInputStream

fun main(args: Array<String>) {
    val inputStream = if (args.isNotEmpty()) {
        FileInputStream(args[0])
    } else {
        FileInputStream("target/classes/program.txt")
    }

    val lexer = EelLexer(CharStreams.fromStream(inputStream))
    val tokens = CommonTokenStream(lexer)
    val parser = EelParser(tokens)
    val listener = EelListener()

    val tree = parser.prog()
    val walker = ParseTreeWalker()

    walker.walk(listener, tree)
}