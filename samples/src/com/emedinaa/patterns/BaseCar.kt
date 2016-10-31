package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class BaseCar :Car{

    override fun assemble() {
        println("Basic Car .")
    }
}

interface Car {
    fun assemble()
}

