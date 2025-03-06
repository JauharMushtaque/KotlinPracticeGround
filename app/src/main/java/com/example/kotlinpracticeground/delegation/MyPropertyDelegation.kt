package com.example.kotlinpracticeground.delegation

/**
Kotlin also allows delegation for properties using the by keyword.
This is useful when you want custom getters/setters without manually writing boilerplate code.
 */

/**
Instead of initializing a property immediately, we can delegate it to lazy {}, which initializes it only when accessed.
 */

/**
✅ Why Use Property Delegation?
✔ Efficient memory usage – Loads data only when needed.
✔ Avoids unnecessary computations.

📌 Summary
✔ Delegation helps a class reuse another class’s functionality without inheritance.
✔ by automatically delegates functions to another object.
✔ Used in logging, storage systems, and multi-implementation classes.
✔ Property delegation (e.g., lazy, observable) reduces boilerplate code.
 */

class User {
    val profile by lazy {
        println("Loading profile data...")  // This runs only once
        "User Profile Loaded"
    }
}

fun main() {
    val user = User()
    println("Before accessing profile")
    println(user.profile)  // Loads profile
    println(user.profile)  // Uses cached value
}