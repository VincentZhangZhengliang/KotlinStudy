package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 9:41
 *  Dsc:
 */

fun main(args: Array<String>) {

    //类型检查 is !is

    val str = "hello kotlin"

    getStringLength(str)


    //as as?

    val a = 5
    val b = a as? String
    println(b)
}

fun getStringLength(obj: Any) {

    if (obj is String)
        println("字符串长度是: ${obj.length}")
    else
        println("参数不是字符串")
}