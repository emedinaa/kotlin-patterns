package com.emedinaa.patterns

/**
 * Created by eduardo on 30/10/16.
 */

fun main(args: Array<String>) {
    println("Hello, world!")

    // Singleton --------------------------------------------
    var singleton:Singleton= Singleton.instance
    singleton.message= "Hello Singleton"

    var nSingleton:Singleton= Singleton.instance

    println("singleton "+singleton)
    println("singleton message "+singleton.message)
    println("nSingleton message "+nSingleton.message)

    // Factory ---------------------------------------------
    var factory:Factory= Factory()
    var product1:Product1= factory.createProduct1() as Product1
    var product2:Product2= factory.createProduct2() as Product2

    product1.manipulate()
    product2.manipulate()

    //Adapter ----------------------------------------------
    var target:ITarget= Adapter()
    target.request()

    //Decorator---------------------------------------------
    var sportsCar= SportsCard(BaseCar())
    sportsCar.assemble()

    var sportsLuxuryCar= SportsCard(LuxuryCard(BaseCar()))
    sportsLuxuryCar.assemble()

    //Command ----------------------------------------------

    var receiver:Receiver = Receiver()
    var command:ICommand= Command(receiver)

    var invoker:Invoker= Invoker()
    invoker.setCommand(command)
    invoker.executeCommand()
}
