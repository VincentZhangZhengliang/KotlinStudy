package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 14:43
 *  Dsc:
 */

fun main(args: Array<String>) {

    val map1 = mapOf<String, Int>()

    println(map1.size)

    println(map1.isEmpty())

    val map2 = emptyMap<String, Int>()

    println(map2.size)


    val map3 = mapOf<Int, String>(1 to "一", 2 to "二", 3 to "三")

    println(map3)

    println(map3.get(1))

    println(map3.entries)

    val map4 = mutableMapOf(1 to "一", 2 to "二", 3 to "三")

    map4.getOrPut(5, { "五" })

}

