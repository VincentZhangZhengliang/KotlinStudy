package ch04

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/23 17:52
 *  Dsc:
 */


fun main(args: Array<String>) {


    println(lazyValue)
    println(lazyValue)

    println(normalValue)

}

val lazyValue: String by lazy {
    println("lazyValue 初始化")
    "Hello"
}

val normalValue: String = "Kotlin"


