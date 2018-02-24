package ch04

import kotlin.properties.Delegates

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/23 17:52
 *  Dsc:
 */


fun main(args: Array<String>) {

//    println(lazyValue)
//    println(lazyValue)
//    println(normalValue)

//    str = "hello"
//    str = "topzrt"

//    str1 = "hello"
//    str1 = "topzrt"
//    str1 = "top"

//    str2 = "notNull"
//    println(str2)

    val map: MutableMap<String, Any?> = mutableMapOf(
            "name" to "John Doe",
            "age" to 25
    )

    val user = User(map)

    println(user.name)
    println(user.age)

    println("___________修改map集合的值____________")
    map.put("name","Green Dao")
    map.put("age",23)

    println(user.name)
    println(user.age)

}


class User(val map: MutableMap<String, Any?>) {

    val name: String by map
    val age: Int by map

}

val lazyValue: String by lazy {
    println("lazyValue 初始化")
    "Hello"
}

val normalValue: String = "Kotlin"

var str: String by Delegates.observable("kotlin", { property, oldValue, newValue ->

    println("___________属性变化时间的响应器被触发____________")
    println("属性的名字：${property.name}")
    println("属性的旧值：$oldValue")
    println("属性的新值：$newValue")

})


var str1: String by Delegates.vetoable("vetoable", { property, oldValue, newValue ->

    println("___________属性变化时间的响应器被触发____________")
    println("属性的名字：${property.name}")
    println("属性的旧值：$oldValue")
    println("属性的新值：$newValue")
    newValue.contains("zrt")

})

var str2: String by Delegates.notNull()




