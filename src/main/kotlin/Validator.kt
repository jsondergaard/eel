package org.eel

import java.util.*

data class Error(val message: String, val position: Point)

fun Program.validate() : List<Error> {
    val errors = LinkedList<Error>()

    // check a variable is not duplicated
    val varsByName = HashMap<String, VarDeclaration>()
    this.specificProcess(VarDeclaration::class.java) {
        if (varsByName.containsKey(it.varName)) {
            errors.add(Error("A variable named '${it.varName}' has been already declared at ${varsByName[it.varName]!!.position!!.start}",
                it.position!!.start))
        } else {
            varsByName[it.varName] = it
        }
    }

    return errors
}