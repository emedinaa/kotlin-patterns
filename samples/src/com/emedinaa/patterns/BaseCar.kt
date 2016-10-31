package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class BaseCar :ICar{

    override fun assemble() {
        println("Basic Car .")
    }
}

interface ICar {
    fun assemble()
}

