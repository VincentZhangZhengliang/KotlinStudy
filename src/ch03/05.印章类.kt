package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 14:27
 *  Dsc:印章类让一个类拥有了有限多个子类。印章类甚至可以理解为一个特殊的枚举类。印章类本身不能被实例化。
 */

fun main(args: Array<String>) {

    val add = Operation.Add()

    printInfo(add)
}

sealed class Operation {

    class Add : Operation()
    class Substract : Operation()
    class Multiply : Operation()
    class Divide : Operation()

}

fun printInfo(op: Operation) {
    when (op) {
        is Operation.Add -> println("加 操作")
        is Operation.Substract -> println("减 操作")
        is Operation.Multiply -> println("乘 操作")
        is Operation.Divide -> println("除 操作")
    }
}



