package ch05

/**
 *  Package:ch05
 *  User:Vincent
 *  Date:2018/2/24 15:57
 *  Dsc:
 */
fun main(args: Array<String>) {

    val intArr = arrayOf(1, 2, 3, 4)

    val slice = intArr.slice(IntRange(0, -1))

    println(slice)

    val drop = intArr.drop(3)

    println(drop)


}