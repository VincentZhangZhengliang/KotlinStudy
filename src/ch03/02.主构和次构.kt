package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 11:46
 *  Dsc:
 */

class Person1(var name: String) {

    init {
        println("init")
    }

    var age: Int = 0

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    fun printInfo() {
        println("我是$name,我今年$age")
    }

}

fun main(args: Array<String>) {

    val p = Person1("kotlin", 18)

    p.printInfo()
}