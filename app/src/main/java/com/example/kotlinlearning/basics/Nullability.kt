package com.example.kotlinlearning.basics

fun main () {

    //Assigning rocks to null without a question mark will return an error
    var rocks: Int? = null

    rocks = 5

    //Adding ? before .method() basically says if not null then run the method
    rocks = rocks?.dec()
    println(rocks)

    //Elvis operator if rocks is not null then run dec(), otherwise set rocks to 1
    rocks = null
    println(rocks?.dec() ?: 1)

    //Not null assertion operator !!, means the value will be not null
    val s = "Hello"
    val len = s!!.length
    println(len)


}

