package com.emedinaa.patterns

/**
 * Created by eduardo on 30/10/16.
 */
class Factory {

    fun createProduct1():IProduct{
        return  Product1()
    }

    fun  createProduct2():IProduct{
        return  Product1()
    }
}