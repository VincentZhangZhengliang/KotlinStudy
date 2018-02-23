package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 10:58
 *  Dsc:
 */

fun main(args: Array<String>) {

    val p = Person()
    println(p.age)
    p.age = 12
}

class Person {

    var name = "芳儿"
        private set
    var age = 28
        get() = 18
        set(value) {
            field = value
            println(field)
            if (value > 18)
                println("${name}年龄${age},是成年人")
            else
                println("${name}年龄${age},是未成年人")
        }



}