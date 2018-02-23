package 函数式编程

/**
 *  Package:函数式编程
 *  User:Vincent
 *  Date:2017/11/24 15:24
 *  Dsc:
 */


fun factorial(n: Int): Int {

    if (n == 0)
        return 1
    return n * factorial(n - 1)

}

fun main(args: Array<String>) {

    println(factorial(5))

}

