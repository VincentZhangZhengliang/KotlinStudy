package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 10:09
 *  Dsc:
 */
fun main(args: Array<String>) {
    noArgNoRet()
    println(noArgWithRet())
    argNoRet("argNoRet")
    println(argWithRet("argWithRet"))
}

//表达式函数体 就是函数体之前放在大括号里面，现在可以放在等号右边。
//函数体只有一行代码的时候，才能用表达式函数体。
fun noArgNoRet() = println("outerfun")

fun noArgWithRet(): String = "innerFun"

fun argNoRet(content: String) = println(content)

fun argWithRet(content:String):String = content

