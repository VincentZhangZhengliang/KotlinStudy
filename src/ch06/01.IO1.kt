package ch06

import java.io.File
import java.nio.charset.Charset

/**
 *  Package:ch06
 *  User:Vincent
 *  Date:2018/2/24 16:26
 *  Dsc:
 */

fun main(args: Array<String>) {

    val file = File("E:/IO/01.txt")

    val s = file.readText(Charset.forName("utf-8"))

    println(s)


}