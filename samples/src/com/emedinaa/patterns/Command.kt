package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */
class Command(r: Receiver):ICommand {

    var receiver:Receiver
    init {
        receiver=r
    }
    override fun execute() {
        receiver.action()
    }

}
interface ICommand {
    fun execute()
}

class Receiver{
    fun action(){
        println("Receiver : doing action")
    }
}

class Invoker{
    var currentCommand:ICommand?=null

    fun setCommand(c:ICommand){
        currentCommand= c
    }

    fun executeCommand(){
        currentCommand?.execute()
    }
}