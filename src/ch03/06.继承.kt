package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 14:54
 *  Dsc:
 */

fun main(args: Array<String>) {


}


open class Person2(var name: String) {
    fun eat(): String {
        return "吃饭"
    }
}

class Man(name: String) : Person2(name)


class Woman : Person2 {
    constructor(name: String) : super(name)
}
