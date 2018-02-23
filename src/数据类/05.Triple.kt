package 数据类

/**
 *  Package:数据类
 *  User:Vincent
 *  Date:2017/11/24 9:32
 *  Dsc:
 */


fun main(args: Array<String>) {

    val triple = Triple(1, "one", "一")

    println(triple.first)

    println(triple.second)

    println(triple.third)

    val list = triple.toList()

    list.forEach { println(it) }


}