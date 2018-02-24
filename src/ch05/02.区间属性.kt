package ch05

/**
 *  Package:ch05
 *  User:Vincent
 *  Date:2018/2/24 10:30
 *  Dsc:
 */

fun main(args: Array<String>) {

    val charRange = 'a'..'d'

    var first = charRange.first

    var last = charRange.last

    var start = charRange.start

    println("第一个元素：$first")
    println("第一个元素：$start")
    println("最后一个元素：$last")

    println("是否包含元素a : ${charRange.contains('a')}")

    println(charRange.count())

}