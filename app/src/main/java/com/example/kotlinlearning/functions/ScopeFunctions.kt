package com.example.kotlinlearning.functions

fun main() {

    //let gives you a block of code to execute after a certain verification
    //ex: user?.let {PERFORM ACTIONS KNOWING USER IS NOT NULL}
    //it keyword contains the copy of the property inside let
    var word: String = "Hello World"
    word.let {println("$it!!")}
    println(word)

    //apply is an extension function on a type
    //apply lets you access the object directly and make changes
    val person = Person("Morgan", "Apply")
    person.apply { this.tutorial = "Kotlin"}
    println(person)

    //run allows you to execute block of code without worrying about threading
    var tutorial = "This is a Kotlin Tutorial"
    println(tutorial)
    tutorial = run {
        val tutorial = "This is a run tutorial"
        tutorial
    }
    println(tutorial)

    //with gives you the object reference to work with, similar to run
    val person2 = Person("Frank", "Kotlin")
    with (person2) {
        name = "Morgan"
        tutorial = "With"
    }
    println(person2)

    //also adds additional tasks to be completed after the first
    val list = listOf<String>("Hello", "World").also{ it ->
        println("Returned list $it")
    }
    println(list)




}

data class Person(var name: String, var tutorial: String)

