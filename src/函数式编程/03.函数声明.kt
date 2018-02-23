package 函数式编程

/**
 *  Package:函数式编程
 *  User:Vincent
 *  Date:2017/11/24 15:52
 *  Dsc:
 */


fun double(x: Int): Int {
    return 2 * x
}

fun main(args: Array<String>) {

    println(double(3))

    FPBasics.test()

}

object FPBasics {

    fun double(x: Int): Int {
        return 2 * x
    }

    fun test() {
        val doubleTwo = double(2)
        println("double(2) = $doubleTwo")
    }
}