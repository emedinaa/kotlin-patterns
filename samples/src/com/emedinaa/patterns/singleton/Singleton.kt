package com.emedinaa.patterns.singleton

/**
 * Created by eduardo on 30/10/16.
 */
class Singleton {

    companion object{
        val instance = Singleton()
    }
    lateinit var message:String
}