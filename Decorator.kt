package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
open class Decorator(val c:Car):Car{
    var car:Car

    init {
        car=c
    }

    override fun assemble() {
        car.assemble()
    }
}

class SportsCard(c:Car):Decorator(c){

    override fun assemble() {
        super.assemble()
        println("Decorator adding features of Sports Car.")
    }
}

class LuxuryCard(c:Car):Decorator(c){

    override fun assemble() {
        super.assemble()
        println("Decorator adding features of LuxuryCard Car.")
    }
}