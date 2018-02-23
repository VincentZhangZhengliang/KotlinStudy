package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 10:54
 *  Dsc:
 */


fun main(args: Array<String>) {

    println(add(100000000))

}


tailrec fun add(n: Int, total: Long = 0): Long {

    return if (n == 1)
        total + 1
    else
        add(n - 1, n + total)

}