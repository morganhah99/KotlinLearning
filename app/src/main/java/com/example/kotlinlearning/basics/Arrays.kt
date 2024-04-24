package com.example.kotlinlearning.basics

fun main () {

    //Arrays immutable. Once you create an array, the size is fixed.
    //You can't add or remove elements, except by copying to a new array

    //arrayOf doesn't have a type associated with the elements so you can mix types
    val mix = arrayOf("Hello", 1)
    println(mix)

    //You can declare arrays with one type for all elements
    val numbers = intArrayOf(1, 2, 3)
    println(numbers)

    //Can combine two arrays together
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5]) // -> 3

    //If you don't use this for an int array you'll get the address instead of contents
    println(java.util.Arrays.toString(numbers))


}