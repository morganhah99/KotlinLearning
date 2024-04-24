package com.example.kotlinlearning.functions

fun main () {


    //A lambda is an expression that makes a function
    //Instead of a named function, there is no name (Anonymous functions)


    //English Translation
    //waterFilter has parameter type Int which returns an Int
    //This return = to the expression inside the {}
    //Which returns 15
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
    println(waterFilter(50))
}