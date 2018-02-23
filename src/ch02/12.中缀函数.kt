package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 10:48
 *  Dsc:一个函数为成员函数或者拓展函数，并且只有一个参数，并且使用infix修饰。
 */

fun main(args: Array<String>) {

    val a = A()
    a printInfo1 "printInfo1"
    a printInfo2 "printInfo2"

}

class A {

    infix fun printInfo1(str: String) {
        println(str)
    }

}

infix fun A.printInfo2(str: String) {
    println(str)
}