package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:14
 *  Dsc:
 */


fun main(args: Array<String>) {
    val listOf1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    val filter = listOf1.filter { it % 2 == 0 }
    filter.forEach { println(it) }
}