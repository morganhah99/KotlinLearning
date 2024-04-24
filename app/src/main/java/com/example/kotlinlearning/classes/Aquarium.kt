package com.example.kotlinlearning.classes


//Properties in a class are public by default
//If you define a property with var, they are mutable, meaning
//they're readable and writable.
//If you define a property with val, they're readonly only after initialization

//If you want a property that your code can read or write, but outside code can only read,
//you can leave the property and its getter as public but its setter private

//Be default classes can't be inherited, similarly properties can't be overridden by subclasses
//But they can be accessed. Must mark the class with open, same with properties.
//Serve as parameters and properties for the class
open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    //Kotlin classes can have one or more secondary constructors
    //to allow constructor overloading which means constructors with different arguments

    //This constructor makes a new property called tank
    //This constructor uses the values for length and width from the primary constructor
    constructor(numberOfFish: Int) : this() {

        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    //Kotlin automatically creates getters and setters for any property in a class
    open var volume: Int
        get() = width * height * length / 1000
        //By convention the named parameter for the setter is value
        set(value) {
            height = (value * 1000)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9


    //init blocks get executed whenever an instance of Aquarium is initialized
    init {
        println("aquarium initializing")
    }


    //Method for class
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}