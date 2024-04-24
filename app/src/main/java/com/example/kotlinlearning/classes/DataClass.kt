package com.example.kotlinlearning.classes


//data class is an object that mainly exists to hold data
//This object comes with extra utilities such as printing and copying
data class Decoration(val rocks: String)

data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations2() {
    val d5 = Decoration2("Crystal", "tree", "Diver")
    println(d5)

    //This is the same thing as writing d5.rocks, d5.wood, d5.diver
    //This is how you extract values from data class object
    //Meaning rock = crystal, wood = tree, diver = diver
    //This is not an array or list, it is simply the instance of the Decoration2 data class
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    //You can choose to skip a property
    val (stone, lumber, _) = d5
    println(stone)
    println(lumber)
}

fun makeDecorations() {

    val decoration1 = Decoration("Granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))
}

//Enums allow you to enumerate something and refer it by name
//Enumerating means to iterate over elements in a collection while also keeping track of the index
//Basic declaration only needs a list of names, but you can also define one or more fields
//associated with each name
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main(){
//    makeDecorations2()

    //.name refers to property name
    println(Direction.EAST.name) // -> EAST
    println(Direction.EAST.degrees) // -> 90
    println(Color.RED.rgb)
}