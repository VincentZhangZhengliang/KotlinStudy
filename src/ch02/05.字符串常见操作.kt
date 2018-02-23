package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 9:08
 *  Dsc:
 */

fun main(args: Array<String>) {

    //字符串遍历
    val str: String = "字符串常见操作"
    for (c in str) {
        println(c)
    }

    //split
    val str1 = "hello.kotlin"
    val split = str1.split(".")
    for (s in split) {
        println(s)
    }

    //split 传入多个参数
    println("hello.kotlin-topzrt".split(".", "-"))


    //toRegex

    println("hello.kotlin.topzrt".split("\\.".toRegex()))

    //substring

    println("kotlin".substring(2..3))
    println("kotlin".substring(2))
    println("kotlin".substring(2, 4))
    println("kotlin".substringAfter('t'))
    println("kotlin".substringAfter("tl"))
    println("hello/kotlin/topzrt".substringBefore("/"))
    println("hello/kotlin/topzrt".substringBeforeLast("/"))

    //去空格
    println("  内容  ".trim())
    println("  内容  ".trimEnd())
    println("  内容  ".trimStart())

    //去除前导空格 ，每行前面的空格
    println("""  |内容
                 |内容
                 |内容
                 |内容""".trimMargin())

    //去除指定的字符
    println("- 内容 - 啊哈哈-".trim { it == '-' })
    println(" - 内容 - 啊哈哈-".trimIndent())





}