package com.example.kotlinlearning.functions

fun main () {

    //lets you extend the functionality of a class without inheriting it

    val word: String = "kotlin"
    word.capitalizeFirstLetter()

    val math = Math(5, 5)
    math.add()
    math.squareNumber()



}

fun String.capitalizeFirstLetter() {
    println(this[0].uppercase() + this.substring(1))
}


class Math(val num1: Int, val num2: Int) {

    fun add() {
        println(num1 + num2)
    }
}

fun Math.squareNumber() {
    println(num1 * num2)
}
