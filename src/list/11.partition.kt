package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 13:40
 *  Dsc:
 */


fun main(args: Array<String>) {
    val listOf1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(listOf1.partition { it > 5 })
}