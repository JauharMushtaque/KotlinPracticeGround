package com.example.kotlinpracticeground.delegation

/**
Delegation is a design pattern where one object hands over (delegates) responsibility to another object.
In Kotlin, delegation is mainly used for:
1	Class Delegation → An object delegates functionality to another object.
2	Property Delegation → A property’s getter/setter is handled by a delegate object.*/

/**
✅ How Delegation Helps?
✔ Logger does not need to override methods manually.
✔ Any Printer implementation (e.g., FilePrinter) can be used without changing Logger.
✔ Less boilerplate code than inheritance.
 */

interface Printer {
    fun printMessage()
}

class ConsolePrinter : Printer {
    override fun printMessage() {
        println("Printing to console...")
    }
}

// Logger delegates all Printer functions to ConsolePrinter automatically
class Logger(private val printer: Printer) : Printer by printer

fun main() {
    val logger = Logger(ConsolePrinter())  // Delegates to ConsolePrinter
    logger.printMessage()  // Prints: Printing to console...
}
