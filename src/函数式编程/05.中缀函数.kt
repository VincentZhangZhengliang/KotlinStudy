package 函数式编程

/**
 *  Package:函数式编程
 *  User:Vincent
 *  Date:2017/11/24 16:08
 *  Dsc:
 */

infix fun Int.sho(x: Int): Int {

    return x + 1
}

fun main(args: Array<String>) {


    val i = 3
    println(i.sho(3))

    println(i sho 5)

    val person = Person()

    println(person hello "World")


}

infix fun Person.hello(str: String): String {

    return "Hello $str"

}

class Person