package ch05

/**
 *  Package:ch05
 *  User:Vincent
 *  Date:2018/2/24 10:13
 *  Dsc:
 */
fun main(args: Array<String>) {

//    //闭区间
//    for (i in IntRange(1, 4)) {
//        println(i)
//    }
//
//    for (i in 1.rangeTo(9)) {
//        println(i)
//    }
//
//    for (i in 1..4) {
//        println(i)
//    }
//
//    //半开半闭区间
//    for (i in 1.until(6)) {
//        println(i)
//    }

    //开区间(1,10)
    val range1 = 2..9
    val range2 = 2.rangeTo(9)
    val range3 = IntRange(2, 9)
    val range4 = 2.until(10)

    println(range1.toList())
    println(range2.toList())
    println(range3.toList())
    println(range4.toList())


}