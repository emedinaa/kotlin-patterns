package com.emedinaa.patterns.factory

import com.emedinaa.patterns.factory.Product
import com.emedinaa.patterns.factory.Product1
import com.emedinaa.patterns.factory.Product2

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