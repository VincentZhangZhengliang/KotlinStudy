package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 13:46
 *  Dsc:
 */


fun main(args: Array<String>) {

    val listOf1 = listOf<Int>(1, 2, 3)
    val listOf2 = listOf<Int>(4, 5)
    println(listOf1.plus(listOf2))
    println((listOf1 + listOf2))
    println(listOf1.plusElement(6))

}