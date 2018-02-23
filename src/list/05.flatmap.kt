package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:29
 *  Dsc:
 */

fun main(args: Array<String>) {

    val listOf1 = listOf<String>("a", "b", "c")

    println(listOf1.map { it -> listOf(it + 1, it + 2, it + 3) })

    println(listOf1.map { it -> listOf(it + 1, it + 2, it + 3) }.flatten())

    println(listOf1.flatMap { it -> listOf(it + 1, it + 2, it + 3) })

}