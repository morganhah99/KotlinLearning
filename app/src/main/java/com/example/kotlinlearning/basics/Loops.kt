package com.example.kotlinlearning.basics

fun main () {

    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        println(element + " ")
    }

    //You can loop through the elements and indices at the same time

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element")
    }

    //Can use downTo to count down from 5-4 inclusive
    for (i in 5 downTo 1) println(i)

    //Can use step to count up from 3-6 inclusive
    for (i in 3..6 step 2) println(i) // -> 35

    //Can also specify a range of characters alphabetically
    for (i in 'd'..'g') println(i) // -> defg

    var bubbles = 0

    //this while loop keeps incrementing bubbles until it is 50 then it prints
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in water")

    //do statement gets executed first, then checks if the condition if condition is true, if not it exits the loop
    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in water")

    //Executes a block of code a specified amount of times
    repeat(2) {
        println("That's a lot of damage!")
    }
}