package com.example.kotlinlearning.classes

import kotlin.math.PI

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {


    //This idea is polymorphism
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water: Double = volume * 0.8

    override val shape = "Cylinder"
}