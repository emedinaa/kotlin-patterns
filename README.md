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
 ```
## Singleton
  Ensure a class has only one instance, and provide a global point of access to it.
  ```
    class Singleton {
      companion object{
          val instance = Singleton()
          }
      var message:String?=null
    }
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

    var sportsLuxuryCar= SportsCard(LuxuryCard(BaseCar()));
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
## Command
## Observer
## State
## Strategy
