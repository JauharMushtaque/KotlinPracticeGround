package com.example.kotlinpracticeground.practise.functions.scope_functions

/**
 * let is called a scope function because it defines a temporary scope for an object and
 * allows you to perform operations within that scope.
 * The object on which let is called is available inside the lambda as it.
 * After executing the lambda, the function returns the result of the lambda expression.*/

/**
 * Why let is a Scope Function?
 * Defines a Scope: Inside let, we get a temporary scope where we can work with it (which is cart in this case).
 * Null Safety: We use ?.let to execute the block only if cart is not null, avoiding null pointer exceptions.
 * Encapsulated Logic: The operations on cart (like printing items and applying a discount) are done within the let scope, keeping the main code clean.*/

/**
 * ✅ Key Features of let:
 * 	•	Executes a block of code only if the object is non-null (it refers to the object).
 * 	•	Returns the result of the last expression inside the lambda.
 * 	•	Helps in chaining function calls and avoiding redundant variable names.
 * */

/**
 * Analogy:
 * Think of let like going to a shopping counter:
 *
 * If you have a cart (not null), you go to the counter (let block).
 * Inside the counter, you apply a discount and check out.
 * If there's no cart, you don't go to the counter (let doesn't execute).*/

fun main() {
    var name: String? = "ali"
    val secName = name?.let {
        println(it)
        println("Length of name: ${it.length}")  // ✅ Output: Length of name:3
        2
    }
    println(name)
    println(secName)
}

/**
 * output:
 * ali
 * Length of name: 3
 * ali
 * 2*/