package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/22 10:30
 *  Dsc:
 */
abstract class Person(var name: String, var age: Int) {

    init {
        println("name = $name,age = $age")
    }

    abstract var addr: String
    abstract val weight: Float

    abstract fun doEat()
    abstract fun doWalk()

    fun doSwim() {
        println("I am Swiimming")
    }

    open fun doSleep(){
        println("I am Sleeping")
    }

}
