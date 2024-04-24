package com.example.kotlinlearning

fun main () {
//    val numbers = listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65)
//
//    val num2 = numbers
//
//    println(num2)

    val str = "(03/12)"
    val month = str.slice(1..2)
    println(month)
    val year = str.slice(4..5)
    println(year)
}