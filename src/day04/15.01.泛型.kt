package 第四天面向对象

fun main(args: Array<String>) {

    val box = Box(1)
    println(box.value.javaClass)

}

class Box<T>(t: T) {
    val value = t
}