package com.example.kotlinlearning.basics

fun main () {

    //Initializing a variable with different types
    var string1: String = "Hello World"

    var num1: Int = 123

    var num2: Int = 321

    //String template
    val string = "num1 is ${num1}, num2 is ${num2}"
    println(string)

    //Var variables can be reassigned while val variables can not
    num1 = num2

    println("Num1 is reassigned to num2 ${num1}")





}

