package com.example.kotlinlearning.functions

fun main () {

    //default
    swim()

    //positional argument
    swim("slow")

    //named parameter
    swim(speed = "reallly slow")

    //Called function with only required parameter since other parameters are defined, they're optional
    println(shouldChangeWater("Friday"))

}

//Function with default parameter
fun swim(speed: String = "fast") {
    println("Swimming speed: $speed")
}

//Function with required parameter
//day parameter has no default parameter and logic of function partially relies on know what day it is
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}