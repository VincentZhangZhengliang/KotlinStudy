package ch02

import ch02.顶层函数1.sayHello2Kotlin

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 10:26
 *  Dsc:顶层函数也可以称为包级别函数，就是一个函数，可以直接放到某一个包里面，而不用一定需要放到某一个类里面。
 *      比如main函数
 */

fun main(args: Array<String>) {
    sayHello2Kotlin()  //需要导包
    sayHello2Java()    //在同一包下，不用导包
}