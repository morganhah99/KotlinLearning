package com.example.kotlinlearning.basics

fun main () {

    // if/else statement
    val num1 = 50
    val num2 = 25

    if (num1 > num2) {
        println("${num1} is bigger than ${num2}")
    } else {
        println("${num2} is bigger than ${num1}")
    }

    // if/else with range
    var fish = 100
    //1 - 100 inclusive
    if (fish in 1..100) {
        println(fish )
    }

    fish = 200
    //when statement
    when (fish) {
        0 -> println("Empty Tank")
        in 1..25 -> println("There's some fish")
        else -> println("Now that's a lot of damage")
    }

}