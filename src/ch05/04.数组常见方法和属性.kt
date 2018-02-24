package ch05

/**
 *  Package:ch05
 *  User:Vincent
 *  Date:2018/2/24 15:37
 *  Dsc:
 */
fun main(args: Array<String>) {


    val intArr = arrayOf(1, 2, 3)
    println(intArr[1])

    intArr[1] = 4
    println(intArr[1])

    intArr.set(1,5)
    println(intArr[1])


    println(intArr.first())

    println(intArr.last())

    println(intArr.elementAt(1))

    println(intArr.getOrNull(3))


    for (i in intArr) {
        println(i)
    }

    println(intArr.indexOf(4))

    val plusElement = intArr.plusElement(6)

    println(plusElement.toList())

    intArr.drop(5)

}