package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:16
 *  Dsc:将集合中的元素通过转换函数 transform 映射后的结果，存到一个集合中返回。
 */

fun main(args: Array<String>) {

    val listOf1 = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    println(listOf1.map { it * it })

    val des = mutableListOf<Int>()
    //mapTo : 原理是循环遍历原集合中的元素，并把通过
    //transform映射后的结果放到一个新的destination集合中，并返回destination。
    listOf1.mapTo(des, { it * 3 })

    des.forEach { println(it) }

    //mapIndexed : 可以同时使用下标和元素的值来进行转换
    println(listOf1.mapIndexed { index, i ->
        index * i
    })

    //遍历集合每个元素，得到通过函数算子transform映射之后的值，剔除掉这些值中的
    //null，返回一个无null元素的集合。

    val listOf2 = listOf<String?>("a", null, "c")
    println(listOf2.mapNotNull {
        it
    })


}