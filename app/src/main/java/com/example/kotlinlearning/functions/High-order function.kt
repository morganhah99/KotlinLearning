package com.example.kotlinlearning.functions

fun main () {

    //waterFilter is the lambda expression that is used as the second parameter
    //in updateDirty
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    //To specify the named function as an argument you must use the :: operator
    println(updateDirty(50, ::increaseDirty))


}

//High-order functions is implemented when a function has one or more
//functions as parameters
//English translation:
//updateDirty has two parameters an Int and function parameter which returns an Int
//the function parameter takes an Int parameter and returns an Int
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

//Function passed for high-order function doesn't
//necessarily need to be a nameless function, it can be named
fun increaseDirty(start: Int) = start + 1


