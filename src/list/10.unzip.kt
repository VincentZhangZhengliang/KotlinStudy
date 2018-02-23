package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 13:37
 *  Dsc:
 */

fun main(args: Array<String>) {

    val listOf1 = listOf<Pair<Int, String>>(1 to "一", 2 to "二", 3 to "三")

    println(listOf1.unzip())




}