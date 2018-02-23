package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 12:56
 *  Dsc:
 */

fun main(args: Array<String>) {
    val listOf1 = listOf<Int>(1, 2, 3)
    val listOf2 = listOf<Int>(4, 5, 6, 7)
    val listof3 = listOf<String>("a", "b", "c")

    println(listOf1.zip(listOf2))

    println(listOf1.zip(listof3))

    println(listOf2.zip(listof3))

    println(listOf1.zip(listof3, { t1, t2 -> t2 + t1 }))

    println(listOf1.zip(listOf2, { t1, t2 -> t1 * t2 }))


}