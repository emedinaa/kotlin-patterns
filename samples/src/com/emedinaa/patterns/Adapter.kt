package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class Adapter :Target {

    var adaptee:Adaptee

    init {
        adaptee= Adaptee()
    }


    override fun request() {
        adaptee.specificRequest()
    }

}

interface Target {
    fun request()
}