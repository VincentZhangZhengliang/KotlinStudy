package 数据类

/**
 *  Package:数据类
 *  User:Vincent
 *  Date:2017/11/24 9:17
 *  Dsc:
 */


data class Human(var name: String, var gender: String, var age: Int)


fun main(args: Array<String>) {


    val human = Human("Helen", "female", 15)

    val copy = human.copy(name = "Jack")
    println(copy)

}