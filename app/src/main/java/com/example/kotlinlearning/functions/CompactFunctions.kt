package com.example.kotlinlearning.functions

fun main () {

    println(isTooHot(50))

    println(isDirty(20))

    println(isSunday("Sunday"))
}

//Functions below are examples of compact functions (or single-line expression functions)
//When a function returns the results of a single expression, you specify the body of the function
//after the =
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"