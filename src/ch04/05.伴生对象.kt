package ch04

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/24 10:05
 *  Dsc:
 */

interface ITest

open class C

class A {

    val a = 1
    val b = 3

    fun a() {
        println("a..")
    }

    companion object B : ITest, C() {

        val b: Int = 2

        fun b() {
            println("b = $b")
        }

    }
}

fun main(args: Array<String>) {

    println(A.b)
    A.b()
    println(A().b)
    A().a()
}


