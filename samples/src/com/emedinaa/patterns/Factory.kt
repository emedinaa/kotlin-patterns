package com.emedinaa.patterns

/**
 * Created by eduardo on 30/10/16.
 */
class Factory {

    fun createProduct1(): Product {
        return  Product1()
    }

    fun  createProduct2(): Product {
        return  Product2()
    }
}