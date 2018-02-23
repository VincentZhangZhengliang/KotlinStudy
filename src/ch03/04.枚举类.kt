package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 13:39
 *  Dsc:
 */

enum class Week(val what: String, val doSomething: String) {
    MON("周一", "上班"),
    TUE("周一", "上班"),
    WED("周一", "上班"),
    THU("周一", "上班"),
    FRI("周一", "上班"),
    SAT("周一", "上班"),
    SUN("周一", "上班")
}

fun printInfo(c: Week) {

    if (c == Week.SAT || c == Week.SUN)
        println("今天是周末")
    else
        println("今天是工作日")

    println(Week.MON.name)
    println(Week.MON.ordinal)
    println(Week.MON.what)
    println(Week.MON.doSomething)

}

fun main(args: Array<String>) {
    printInfo(Week.TUE)

}