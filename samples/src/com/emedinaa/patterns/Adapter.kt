package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class Adapter :ITarget {

    var adaptee:Adaptee

    init {
        adaptee= Adaptee()
    }


    override fun request() {
        adaptee.specificRequest()
    }

}

interface ITarget {
    fun request()
}