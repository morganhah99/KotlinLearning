package com.example.kotlinlearning.functions

import java.util.*

fun main () {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

//day is the parameter: String is the return type for the function
fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "Flakes"
        "Tuesday" -> "Pellets"
        "Wednesday" -> "Red Worms"
        "Thursday" -> "Granola"
        "Friday" -> "Pizza"
        else -> "Nothing"
    }

}