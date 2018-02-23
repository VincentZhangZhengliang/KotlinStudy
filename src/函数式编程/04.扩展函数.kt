package 函数式编程

/**
 *  Package:函数式编程
 *  User:Vincent
 *  Date:2017/11/24 15:58
 *  Dsc:
 */


fun String.swap(index1: Int, index2: Int): String {

    val charArray = this.toCharArray()

    val tmp = charArray[index1]

    charArray[index1] = charArray[index2]

    charArray[index2] = tmp

    return charArrayToString(charArray)

}

fun charArrayToString(charArray: CharArray): String {

    var result = ""
    charArray.forEach { it -> result += it }
    return result
}

fun main(args: Array<String>) {
    val str = "abcde"
    val swapStr = str.swap(0, str.lastIndex)
    println(swapStr)
}
