package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class Command(r: Receiver):BaseCommand {

    var receiver:Receiver
    init {
        receiver=r
    }
    override fun execute() {
        receiver.action()
    }

}
interface BaseCommand {
    fun execute()
}

class Receiver{
    fun action(){
        println("Receiver : doing action")
    }
}

class Invoker{
    lateinit  var currentCommand:BaseCommand

    fun setCommand(c:BaseCommand){
        currentCommand= c
    }

    fun executeCommand(){
        currentCommand?.execute()
    }
}