package 数据类

import kotlin.concurrent.thread

/**
 *  Package:数据类
 *  User:Vincent
 *  Date:2017/11/23 16:25
 *  Dsc:
 */


data class Fook(val name: String)

data class User(val name: String, val gender: String, val age: Int) {

    fun validate(): Boolean {
        return true
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}


fun main(args: Array<String>) {

//    val fook = Fook("fook")
//    var fook1 = Fook("fook1")
//
//    println(fook.equals(fook1))
//    println(fook.hashCode())
//    println(fook.component1())
//    val fook2 = fook.copy("sss")
//    println(fook2)
//    println(fook.toString())
//
//
//    val jack = User("jack", "male", 1)
//    println(jack.name)
//    println(jack.gender)
//    println(jack.age)


    val loginUser = LoginUser()
    println(loginUser.name)
    println(loginUser.password)
    val helen = User("Helen", "Female", 15)
    val (name, gender, age) = helen
    println("$name,$gender,$age")
    val pair = Pair(2, "二")
    pair.toList().forEach { println(it) }
    val triple = Triple(1, "一", "壹")
    triple.first
    triple.second
    triple.third
    triple.toList().forEach { println(it) }
    doStop()


}

fun doStop() {

    Thread({ println("doStop...........") }).start()

}

open class DBase
interface IBaseA
interface IBaseB

data class LoginUser(val name: String = "", val password: String = "") : DBase(), IBaseB, IBaseA



