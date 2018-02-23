package 数据类

/**
 *  Package:数据类
 *  User:Vincent
 *  Date:2017/11/23 16:12
 *  Dsc:
 */

class Aook(name: String) {
    val name = name
}

class Dook(val name: String)

class Eook(var name: String)


fun main(args: Array<String>) {

    val aook = Aook("张三")
    aook.name

}

