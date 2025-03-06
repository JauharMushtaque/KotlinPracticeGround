package com.example.kotlinpracticeground.practise.functions.scope_functions

/**
 *also in Kotlin
 * The also function in Kotlin is a scope function that allows you to perform additional operations on an object
 * within a lambda block without modifying it.
 *
 * It is mainly used for logging, debugging, or performing side effects while keeping the original object reference intact.*/


/**
 * When to Use also?
 * Logging and debugging values without modifying them.
 * Performing side effects (e.g., saving to a database, analytics tracking).
 * Chaining operations without affecting the object itself.
 */


/**
 * Basic Syntax of also
 * val result = obj.also {
 *     // Do something with obj (side effects)
 * }
 * The original object (obj) is passed as it inside the lambda.
 * The original object is returned, so the value remains unchanged.
 */


/**
 * also Example - Chaining with Other Scope Functions
 * You can combine also with other scope functions like apply and let.
 *
 * kotlin
 * Copy
 * Edit
 * data class Book(var title: String, var author: String)
 *
 * fun main() {
 *     val book = Book("Kotlin Basics", "John").apply {
 *         title = "Advanced Kotlin"
 *     }.also {
 *         println("Book updated: $it")
 *     }
 * }
 * 🔹 Output:
 * Book updated: Book(title=Advanced Kotlin, author=John)
 * 👉 Why use also here?
 *
 * apply modifies the object.
 * also logs the change without modifying the object.
 */

fun main() {
    var name = "Tuba"
    val secondName = "Jauhar"
    println(secondName)

    val exampleAlso = name.also {
        println(name)
        5
    }
    println(exampleAlso)
}