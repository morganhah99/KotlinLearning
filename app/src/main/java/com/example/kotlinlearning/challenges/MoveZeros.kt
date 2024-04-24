package com.example.kotlinlearning.challenges


fun main() {
    val result = moveZeros(listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65))
    println(result)
}
fun moveZeros(list: List<Int>): List<Int> {
    // For a given list, return a new list with all the zero values moved to the end of the list.
    var movedZeroes = list.toMutableList()
    var numberOfZeros = 0
    for (number in list) {
        if (number == 0){
            numberOfZeros++
        }
    }

    movedZeroes.removeAll {it == 0}

    for (i in 1..numberOfZeros) {
        movedZeroes.add(0)
    }

    return movedZeroes

}


