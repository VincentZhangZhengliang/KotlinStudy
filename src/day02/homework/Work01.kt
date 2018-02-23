package day02.homework

/**
 *  Package:day02.homework
 *  User:Vincent
 *  Date:2017/10/25 8:49
 *  Dsc:
 */

fun main(args: Array<String>) {

    println("Please input name : ")
    var name: String? = readLine()
    println("Please input psw : ")
    var psw: String? = readLine()

    if ("Vincent".equals(name) && "123".equals(psw))
        println("Login Succeed")
    else
        println("Login Failed")
}