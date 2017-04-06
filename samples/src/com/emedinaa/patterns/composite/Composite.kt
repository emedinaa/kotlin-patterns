package com.emedinaa.patterns.composite

/**
 * Created by eduardomedina on 31/10/16.
 */
class Composite(s:String): Component() {

    var sName:String
    var aChildren:MutableList<Component>

    init {
        this.sName= s
        aChildren= mutableListOf<Component>()
    }

    override fun add(c: Component) {
        super.add(c)
        aChildren.add(c)
    }

    override fun remove(c: Component) {
        super.remove(c)
        aChildren.remove(c)
    }

    override fun operation() {
        super.operation()
        println(this.sName)
        aChildren.forEach{
            it.operation()
        }
    }

}

class Leaf(s:String): Component(){

    var sName:String

    init {
        this.sName=s
    }

    override fun operation() {
        super.operation()

        println(this.sName)
    }
}

open class Component{

    open fun add(c: Component){
    }

    open fun remove(c: Component){
    }

    open fun getChild(n:Int): Component {
        throw UnsupportedOperationException("getChild method not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    open fun operation(){ }

}