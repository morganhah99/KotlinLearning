package com.example.kotlinlearning.basics


/*
    when lazy keyword is used, the object will be created only
    when it is called, otherwise there will be no object creation.
    lazy() is a function that takes a lambda and returns an instance
    of lazy which can serve as a delegate of lazy properties upon
    which it has been applied.

    lazy can only be used with nullable variables
    variables can only be val
    lazy does not allocate memory until variable is assessed

    the by lazy indicates that the property will be lazily initialized
    In this example, lazy initialization is demonstrated due to the fact that
    initializing my name is printed only once even though we can
    access myName twice
 */
class LazyDemo {
    val myName: String by lazy {
        println("Initializing my name")
        "www.tutorialspoint.com"
    }
}


/*  lateinit keyword is used to declare variables that are guaranteed to be
    initialized in the future. lateinit can't be used on primitive variable types
    as well as nullable properties. can also only use var

    the property gets initialized when the object is created
    memory of the value is allocated but value is known later

 */

class LateInitDemo {

    // Declaring a lateinit variable of Int type
    lateinit var myVariable: String
    fun initializeName() {
        println("Is myVariable initialized? " + this::myVariable.isInitialized)

        myVariable = "HelloName"

        println("Is it initialized now? " + this::myVariable.isInitialized)

    }
}





fun main() {
//    var obj=LazyDemo();
//    println("Accessing myName for the first time: ${obj.myName}")
//    println("Accessing myName again: ${obj.myName}");
    val demo = LateInitDemo()
    demo.initializeName()
}