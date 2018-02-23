package day06

/**
 *  Package:day06
 *  User:Vincent
 *  Date:2017/11/12 21:02
 *  Dsc:
 */


fun main(args: Array<String>) {

    val list1 = listOf<String>("张三", "李四")

    list1.forEach { println(it) }

    list1.forEachIndexed { index, s ->
        println("index = $index, s = $s")
    }

    for (s in list1) {

        println(s)

    }

    for ((index, value) in list1.withIndex()) {

        println("index = $index , value = $value")
    }

    list1.forEachIndexed { index, s ->
        println("index = $index, s = $s")
    }

    //集合过滤
    list1.filter {
        it.startsWith("张")
    }.forEach {
        println(it)
    }


    val listOf = listOf<Int>()

    val emptyList = emptyList<Int>()

    println(emptyList::class)

    println(emptyList)

    val listOf1 = listOf(1)
    println(listOf1::class)


}