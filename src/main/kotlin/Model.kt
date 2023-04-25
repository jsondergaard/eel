package org.eel

import java.util.*
import kotlin.reflect.KParameter
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

//
// Generic part: valid for all languages
//

interface Node {
    val position: Position?
}

fun Node.isBefore(other: Node) : Boolean = position!!.start.isBefore(other.position!!.start)

fun Point.isBefore(other: Point) : Boolean = line < other.line || (line == other.line && column < other.column)

data class Point(val line: Int, val column: Int) {
    override fun toString() = "Line $line, Column $column"
}

data class Position(val start: Point, val end: Point)

fun pos(startLine:Int, startCol:Int, endLine:Int, endCol:Int) = Position(Point(startLine,startCol),Point(endLine,endCol))

fun Node.process(operation: (Node) -> Unit) {
    operation(this)
    this.javaClass.kotlin.memberProperties.forEach { p ->
        val v = p.get(this)
        when (v) {
            is Node -> v.process(operation)
            is Collection<*> -> v.forEach { if (it is Node) it.process(operation) }
        }
    }
}

fun <T: Node> Node.specificProcess(klass: Class<T>, operation: (T) -> Unit) {
    process { if (klass.isInstance(it)) { operation(it as T) } }
}

fun Node.transform(operation: (Node) -> Node) : Node {
    operation(this)
    val changes = HashMap<String, Any>()
    this.javaClass.kotlin.memberProperties.forEach { p ->
        val v = p.get(this)
        when (v) {
            is Node -> {
                val newValue = v.transform(operation)
                if (newValue != v) changes[p.name] = newValue
            }
            is Collection<*> -> {
                val newValue = v.map { if (it is Node) it.transform(operation) else it }
                if (newValue != v) changes[p.name] = newValue
            }
        }
    }
    var instanceToTransform = this
    if (!changes.isEmpty()) {
        val constructor = this.javaClass.kotlin.primaryConstructor!!
        val params = HashMap<KParameter, Any?>()
        constructor.parameters.forEach { param ->
            if (changes.containsKey(param.name)) {
                params[param] = changes[param.name]
            } else {
                params[param] = this.javaClass.kotlin.memberProperties.find { param.name == it.name }!!.get(this)
            }
        }
        instanceToTransform = constructor.callBy(params)
    }
    return operation(instanceToTransform)
}

//
// Eel specific part
//

data class Program(val procedures: List<Statement>, override val position: Position? = null) : Node

interface Statement : Node { }

interface Expression : Node { }
interface Line : Node { }

interface Type : Node { }

//
// Types
//

//
// Expressions
//

interface BinaryExpression : Expression {
    val left: Expression
    val right: Expression
}

//
// Statements
//

data class VarDeclaration(val varName: String, val value: Expression, override val position: Position? = null) : Statement

data class Print(val value: Expression, override val position: Position? = null) : Statement