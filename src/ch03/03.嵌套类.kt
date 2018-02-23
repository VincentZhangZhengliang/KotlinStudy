package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 11:53
 *  Dsc:
 */

class Outer {

    val str = "Outer"

    class inner {
        fun innerFun() {
            println("inner")
        }
    }

    inner class inner2 {

        fun inner2Fun() {
            println("inner2")
        }

    }

}


fun main(args: Array<String>) {

    val outer = Outer()

    val inner = Outer.inner()

    val inner2 = outer.inner2()

}