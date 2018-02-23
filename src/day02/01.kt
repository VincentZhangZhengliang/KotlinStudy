package day02

/**
 *  Package:day02
 *  User:Vincent
 *  Date:2017/10/25 8:49
 *  Dsc:
 */

fun main(args: Array<String>) {

    println(add5.invoke(4, 3))

}

//函数方式一
fun add(a: Int, b: Int): Int {
    return a + b
}

//函数方式二
fun add1(a: Int, b: Int): Int = a + b

//函数方式三
fun add2(a: Int, b: Int) = a + b

//函数变量一
var add3 = ::add

//函数变量二
var add4: (Int, Int) -> Int = { a, b -> a + b }

//函数变量三
var add5 = { a: Int, b: Int -> a + b }