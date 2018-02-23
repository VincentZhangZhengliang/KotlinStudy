package 单例

import java.util.*

/**
 *  Package:单例
 *  User:Vincent
 *  Date:2017/11/22 17:33
 *  Dsc:
 */

fun distance(x: Double, y: Double): Double {

    val porigin = object {
        var x = 0.0
        var y = 0.0
    }
    return Math.sqrt((x - porigin.x) * (x - porigin.x) + (y - porigin.y) * (y - porigin.y))

}

fun main(args: Array<String>) {
    println(distance(3.0, 4.0))

    countCompare()
}


fun countCompare() {

    val list = mutableListOf(1, 4, 3, 7, 11, 9, 10, 20)

    var countCompare = 0

    Collections.sort(list, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            countCompare++
            println("countCompare = $countCompare")
            println(list)
            return o1.compareTo(o2)
        }

    })


}

