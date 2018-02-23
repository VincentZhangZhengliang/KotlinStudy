package list

/**
 *  Package:list
 *  User:Vincent
 *  Date:2017/11/20 11:36
 *  Dsc:
 */

fun main(args: Array<String>) {

    val listOf1 = listOf<String>("a", "abc", "ab", "def", "abcd")

    val groupBy = listOf1.groupBy { it.length }

    println(groupBy)

    //使用到了Pair
    val listOf2 = listOf("K&R" to "C", "Bjar" to "C++", "Linus" to "C", "James" to "Java")

    println(listOf2)

    println(listOf2.groupBy({ it.second }, { it.first }))

    val listOf3 = listOf<String>("a", "abc", "ab", "def", "abcd")


    //先使用it.length分组，再将it.contains映射的结果放到返回的map中
    println(listOf3.groupBy({ it.length }, { it.contains("b") }))

    val words = "one two three four five six seven eight nine ten".split(" ")

    println(words.groupingBy { it.first() }.eachCount())


}