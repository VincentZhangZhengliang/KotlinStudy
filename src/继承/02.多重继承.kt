package 继承

/**
 *  Package:继承
 *  User:Vincent
 *  Date:2017/11/22 14:59
 *  Dsc:
 */

abstract class Animal {

    fun doEat() {
        println("Animal Eating")
    }

}

abstract class Plant {

    fun doEat() {
        println("Plant Eating")
    }

}


interface Runnable {
    fun doRun()
}

interface Flyable {
    fun doFly()
}

class Dog : Animal(), Runnable {
    override fun doRun() {
        println("Dog Running")
    }
}

class Eagle : Animal(), Flyable {

    override fun doFly() {
        println("Eagle Flying")
    }

}

class Archaeopteryx : Animal(), Runnable, Flyable {

    override fun doRun() {
        println("Archaeopteryx Running")
    }

    override fun doFly() {
        println("Archaeopteryx Flying")
    }

}


fun main(args: Array<String>) {

    val d = Dog()
    d.doEat()
    d.doRun()

    val e = Eagle()
    e.doEat()
    e.doFly()

    val a = Archaeopteryx()
    a.doEat()
    a.doFly()
    a.doRun()

}

