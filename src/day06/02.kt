package day06

/**
 *  Package:day06
 *  User:Vincent
 *  Date:2017/11/17 12:49
 *  Dsc:
 */

fun main(args: Array<String>) {

    val mutableListOf = mutableListOf<Int>(1, 2, 3, 4, 5)

    val listOf1 = listOf<Int>(55, 66, 77, 88, 99)

    val listof2 = listOf<Int>(100, 101, 102, 103)


    val elementAt1 = listOf1.elementAt(3)

    println(elementAt1)

    val elementAtOrElse = listOf1.elementAtOrElse(8, { 1111 })

    println(elementAtOrElse)

    println(listOf1.elementAtOrNull(99))

    println(listOf1.first())

    println(listOf1.firstOrNull())


    println(listOf1.first {

        it == 55
    })

    mutableListOf.add(34)

    mutableListOf.set(3, 22)

    mutableListOf.add(4, 44)

    mutableListOf.remove(22)

    mutableListOf.addAll(listOf1)

    mutableListOf.addAll(2, listof2)

//    mutableListOf.removeAll(listof2)

    val retainAll = mutableListOf.retainAll(listof2)

    println(retainAll)

    mutableListOf.forEachIndexed { index, i ->
        println("index = $index , i = $i")
    }


    println(listOf1.any { it == 55 })

    println(listOf1.all {
        it >= 55
    })

    println(listOf1.none())

    println(listOf1.count())

    println(listOf1.count {
        it > 77
    })

    println(listOf1.reduce({ sum, next -> sum + next }))

    val listOf3 = listOf<String>("a", "b", "c")
    println(listOf3.reduce({ total, s -> total + s }))


    println(listOf1.fold(100, { total, next -> total + next }))

    println(listOf1.max())

    println(listOf1.min())


}