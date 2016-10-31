# kotlin-patterns
Examples of patterns in Kotlin

  Kotlin Design Patterns
  1. Factory
  2. Singleton
  3. Decorator
  4. Adapter
  5. Composite
  6. Command
  7. Observer
  8. State
  9. Strategy
  
## Factory

 ```
    class Factory {

        fun createProduct1():IProduct{
            return  Product1()
        }

        fun  createProduct2():IProduct{
            return  Product2()
        }
    }
    
    interface IProduct {
      fun manipulate()
    }
    
    class Product1 :IProduct{
      override fun manipulate() {
            println("Product 1")
        }
    }
    
    class Product2 :IProduct{
      override fun manipulate() {
            println("Product 2")
        }
    }
    
    //example of use
    var factory:Factory= Factory()
    var product1:Product1= factory.createProduct1() as Product1
    var product2:Product2= factory.createProduct2() as Product2

    product1.manipulate()
    product2.manipulate()
 ```
## Singleton

  ```
    class Singleton {
      companion object{
          val instance = Singleton()
          }
      var message:String?=null
    }
    
    //example of use
    var singleton:Singleton= Singleton.instance
    singleton.message= "Hello Singleton"

    var nSingleton:Singleton= Singleton.instance

    println("singleton "+singleton)
    println("singleton message "+singleton.message)
    println("nSingleton message "+nSingleton.message)
  ```

## Decorator

  ```
    interface ICar {
        fun assemble()
    }
    
    class BaseCar :ICar{

        override fun assemble() {
            println("Basic Car .")
        }
    }
    
    open class Decorator(val c:ICar):ICar{
        var car:ICar

        init {
            car=c
        }

        override fun assemble() {
            car.assemble()
        }
    }

    class SportsCard(c:ICar):Decorator(c){

        override fun assemble() {
            super.assemble()
            println("Decorator adding features of Sports Car.")
        }
    }

    class LuxuryCard(c:ICar):Decorator(c){

        override fun assemble() {
            super.assemble()
            println("Decorator adding features of LuxuryCard Car.")
        }
    }
    
    //example of use
    var sportsCar= SportsCard(BaseCar())
    sportsCar.assemble()

    var sportsLuxuryCar= SportsCard(LuxuryCard(BaseCar()))
    sportsLuxuryCar.assemble()
  ```
## Adapter
  ```
    class Adaptee {

        fun specificRequest(){
            println("Adaptee specificRequest() ")
        }
    }
    
    interface ITarget {
      fun request()
    }
    
    class Adapter :ITarget {

        var adaptee:Adaptee

        init {
            adaptee= Adaptee()
        }


        override fun request() {
            adaptee.specificRequest()
        }

    }
    //example of use
    var target:ITarget= Adapter()
    target.request()
  ```
  
## Composite
  ```
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

    class Leaf(s:String):Component(){

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

        open fun add(c:Component){
        }

        open fun remove(c:Component){
        }

    open fun getChild(n:Int):Component{
            throw UnsupportedOperationException("getChild method not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        open fun operation(){ }

    }
    //example of use
      var composite:Composite = Composite("root")

      var n1:Composite= Composite("composite 1")
      n1.add(Leaf("Leaf 1"))
      n1.add(Leaf("Leaf 2"))

      var n2:Composite= Composite("composite 2")
      n2.add(Leaf("Leaf 3"))
      n2.add(Leaf("Leaf 4"))
      n2.add(Leaf("Leaf 5"))

      composite.add(n1)
      composite.add(n2)
      composite.operation()
  ```
  
## Command
  ```
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
    
    //example of use
    var receiver:Receiver = Receiver()
    var command:ICommand= Command(receiver)

    var invoker:Invoker= Invoker()
    invoker.setCommand(command)
    invoker.executeCommand()
  ```
