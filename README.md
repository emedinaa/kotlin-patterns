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
            return  Product1()
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
## Adapter
## Composite
## Command
## Observer
## State
## Strategy
