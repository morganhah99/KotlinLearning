package com.example.kotlinlearning.functions

fun main () {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    //This example filters the elements that start with p
    //filter goes through each element in the list
    //any element that evaluates to true with the expression,
    //get returned in the filtered list
    //it refers to the current element starting at index 0
    println(decorations.filter {it[0] == 'p'})
    println(decorations)


    //Filters are eager by default
    //Meaning that the filtering is done immediately and a new list
    //containing the filtered elements is returned
    val list = listOf(1, 2, 3, 4, 5)
    println(list.filter { it % 2 == 0 })

    //Example of lazy filter
    //Meaning that the filtering process is not done until the elements are accessed
    //Does not create a new collection immediately.
    //It instead creates a sequence that represents the filtered elements
    //The actual filtering occurs when elements are accessed
    val sequence = sequenceOf(1, 2, 3, 4, 5)

    //Printing without accessing the elements just returns the address to the sequence
    println(sequence)

    //This actually prints the elements
    sequence.forEach { println(it) }


}