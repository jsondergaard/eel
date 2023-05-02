package org.eel

import org.eel.antlr.EelLexer
import org.eel.antlr.EelParser
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes.*
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.util.*

fun main(args: Array<String>) {
    val code : InputStream? = when (args.size) {
        0 -> FileInputStream("target/classes/program.txt")
        1 -> FileInputStream(File(args[0]))
        else -> {
            System.err.println("Pass 0 arguments or 1")
            System.exit(1)
            null
        }
    }
    val parsingResult = EelParserFacade.parse(code!!)
    if (!parsingResult.isCorrect()) {
        println("ERRORS:")
        parsingResult.errors.forEach { println(" * L${it.position.line}: ${it.message}") }
        return
    }
    val root = parsingResult.root!!
    val errors = root.validate()
    if (errors.isNotEmpty()) {
        println("ERRORS:")
        errors.forEach { println(" * L${it.position.line}: ${it.message}") }
        return
    }

    println(root)
}