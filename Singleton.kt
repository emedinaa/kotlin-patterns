package com.emedinaa.patterns

/**
 * Created by eduardo on 30/10/16.
 */
class Singleton {

    companion object{
        val instance = Singleton()
    }
    var message:String?=null
}