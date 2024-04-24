package com.example.kotlinlearning.basics

fun main () {

    //List declaration. By default, lists are immutable
    //order of data matters, can have repetitions
    //read only unless you use mutableListOf
    val school = listOf("Goldfish", "Clownfish", "Salmon")
    println(school)

    //Explicit type declaration of list
    val explicit: List<String> = listOf("Hello", "World", "!")
    println(explicit)

    //Mutable list
    val fish = mutableListOf("Shark", "Tuna")
    fish.remove("Shark")
    println(fish)


    //each key in a map is unique and can only be associated with one value
    //maps are immutable unless you use mutableMapOf

    val iceCreamInventory = mapOf("Vanilla" to 24, "Chocolate" to 14, "Rocky Road" to 7)
    iceCreamInventory.forEach {(flavor, quantity) ->
        println("$flavor: $quantity")
    }

    //data is more important than order
    //will only hold unique values

    val setOfNumbers = setOf(1, 1, 2, 3, 4, 5, 2, 5)
    println("Printing unique numbers in set $setOfNumbers")



}