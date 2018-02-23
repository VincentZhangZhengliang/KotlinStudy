package ch04

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/23 15:41
 *  Dsc:
 */

fun main(args: Array<String>) {


    println("kotlin".getLastChar())

    println("kotlin".lastChar)

}

val String.lastChar: Char
    get() = get(length - 1)

fun String.getLastChar(): String {
    return this.substring(this.length - 1, this.length)
}



