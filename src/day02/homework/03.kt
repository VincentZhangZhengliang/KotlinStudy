package day02.homework

/**
 *  Package:day02.homework
 *  User:Vincent
 *  Date:2017/10/31 21:57
 *  Dsc:
 */

fun main(args: Array<String>) {


    println(sum(5, 0))

}


tailrec fun sum(n: Int, sum: Int): Int {

    if (n == 1)
        return 1 + sum
    else
        return sum(n - 1, sum + n)

}


class Person {


    operator fun inc(): Person {


        return this
    }

}
