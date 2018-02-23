package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:11
 *  Dsc:过滤出满足条件的元素并赋值给destination
 */

fun main(args: Array<String>) {

    val listOf1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    val mutableListOf1 = mutableListOf<Int>()

    //将集合中大于3 的元素赋值到mutableListOf1
    listOf1.filterTo(mutableListOf1, { it > 3 })

    println(mutableListOf1)
}