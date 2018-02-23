package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 9:52
 *  Dsc:
 */

fun main(args: Array<String>) {

    var price: String
    var age: String? = null

//    //对于可空的处理
//    //方式1
//    if (age != null)
//        age.toInt()
//    //方式2
//    age?.toInt()
//    //方式3
//    age!!.toInt()

    val result = age?.toInt() ?: throw NumberFormatException("格式不对")
    println(result)

}