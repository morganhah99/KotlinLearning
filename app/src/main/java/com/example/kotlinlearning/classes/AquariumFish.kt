package com.example.kotlinlearning.classes


//Abstract classes can have constructors
//While interfaces can not
//You can use multiple interfaces in a class
//while you can only subclass from one abstract class



//Abstract classes are typically used
//when you're defining common properties
//for different classes
abstract class AquariumFish {
    abstract val color: String
}


class Shark(fishColor: FishColor = GrayColor):
        FishAction by PrintingFishAction("Eating other fish"),
        FishColor by fishColor


//Example of interface delegation
//English translation
//This class takes a parameter of type FishColor, with a default
//value of GoldColor. Which means that if no FishColor object is present
//then the default will be gold.
//FishColor by fishColor delegates the implementation of the FishColor
//interface to the fishColor parameter.
class Pleco(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("Eat Algae"),
    FishColor by fishColor



class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

//Interfaces are typically created
//to define common behaviors for different classes
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

//Singleton object acts as a helper
//class that implements FishColor
//In general provide a convenient and globally accessible
//way to interact with this instance
object GoldColor: FishColor {
    override val color = "Gold"
}

object GrayColor: FishColor {
    override val color = "Gray"
}

//A sealed class is a class that can be subclassed, but only inside the file in which it's declared
//If you try to subclass the class in a different file, you get an error
sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

//is keyword checks whether an object is an instance of a particular type
fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "Walrus"
        is SeaLion -> "sea lion"
    }
}

fun main () {
    val seaLion = SeaLion()
    val walrus = Walrus()
    println(matchSeal(seaLion))
    println(matchSeal(walrus))
}