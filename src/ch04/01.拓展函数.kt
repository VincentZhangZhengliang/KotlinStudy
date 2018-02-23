package ch04

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/23 15:41
 *  Dsc:
 */

fun main(args: Array<String>) {


    println("kotlin".getLastChar())

}

fun String.getLastChar(): String {
    return this.substring(this.length - 1, this.length)
}


class View{

}

