package 数据类

/**
 *  Package:数据类
 *  User:Vincent
 *  Date:2017/11/24 9:29
 *  Dsc:
 */

fun main(args: Array<String>) {


    val pair = Pair(1, "one")

    println(pair.first)
    println(pair.second)

    val toList = pair.toList()

    toList.forEach { println(it) }


}