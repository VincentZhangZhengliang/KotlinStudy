package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:06
 *  Dsc: 取开始下标至结束下标元素子集合
 */


fun main(args: Array<String>) {

    val listOf1 = listOf(1, 2, 3, 4)

    println(listOf1.slice(1..3))

    //返回指定下表的元素子集合
    println(listOf1.slice(listOf(3, 2, 1)))

}