package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 12:51
 *  Dsc:
 */

fun main(args: Array<String>) {
    val listOf1 = listOf<Int>(2, 1, 6, 3, 9, 4, 7, 5)

    //正序排列
    println(listOf1.sorted())
    //倒序排列
    println(listOf1.sortedDescending())

    val listOf2 = listOf<String>("abc", "c", "bn", "opqde")

    println(listOf2.sortedBy { it.length })

    println(listOf2.sortedByDescending { it.length })

}