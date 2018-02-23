package 委托

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2018/1/8 17:10
 *  Dsc:
 */

fun main(args: Array<String>) {

}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {

    override fun print() {
        println(x)
    }

}

class Derived(b: Base) : Base by b {

    fun add() {

    }

}


