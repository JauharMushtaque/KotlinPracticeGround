package com.example.kotlinpracticeground.practise.functions.scope_functions

/**
The apply function in Kotlin is a scope function that is used for modifying an object's properties within a lambda block
and returning the same object.

It is useful when you want to initialize or update an object in a clean and readable way.
 */

/**
apply Example - Configuring Objects
apply is useful when setting multiple properties in one go.
👉 Why use apply here?

It makes initialization look cleaner.
Instead of setting each property separately, everything is done inside apply
 */


class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0
}

fun main() {
    val car = Car().apply {
        brand = "Tesla"
        model = "Model S"
        year = 2024
    }.also {
        it.brand = "jauhar"
    }
    println(car.brand + car.model+ car.year)  // Output: Car(brand=Tesla, model=Model S, year=2024)
}