package ch05

/**
 *  Package:ch05
 *  User:Vincent
 *  Date:2018/2/24 15:09
 *  Dsc:
 */

fun main(args: Array<String>) {


    val intArr = arrayOf(1, 2, 3)
//
//    val strArr = arrayOf("a", "b", "c")
//
//    val studentArr = arrayOf(Student("张三", 23),
//            Student("李四", 24),
//            Student("王五", 25))
//
//    val anyArr = arrayOf(1, 2, 3, 'a', 'b', 'c')
//
//    val arr1 = Array<Int>(5) {
//        it * 2
//    }
//    for (i in arr1) {
//        println(i)
//    }


    /*************************************************/

    for (i in intArr) {
        println(i)
    }

    intArr.forEach {

        println(it)

    }

    intArr.forEachIndexed { index, i ->
        println("index = $index, i = $i")
    }

    for ((index, value) in intArr.withIndex()) {
        println("index = $index, value = $value")

    }

    for (i in intArr.withIndex()) {
        i.index
        i.value
    }

    for (index in intArr.indices) {

    }


}

class Student(var name: String, var age: Int)