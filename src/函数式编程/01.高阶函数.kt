package 函数式编程

/**
 *  Package:函数式编程
 *  User:Vincent
 *  Date:2017/11/24 14:21
 *  Dsc:

 */


fun main(args: Array<String>) {

    println(isOdd(3))

    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")

    println(strings.filter(oddLength))

    println(oddLength)


    val addOneLambda = { x: Int -> x + 1 }

    println(addOneLambda(1))


    val addOneAnonymouse = (fun(x: Int): Int {
        return x + 1
    })

    println(addOneAnonymouse(2))


    println(curryAdd(1)(2))


    val lambdaCurryAdd = { x: Int ->
        { y: Int ->
            x + y
        }
    }
    println(lambdaCurryAdd(1)(2))


}

fun isOdd(x: Int) = x % 2 != 0

fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {

    return { x -> f(g(x)) }

}


fun add(x: Int, y: Int): Int {

    return x + y

}

fun curryAdd(x: Int): (Int) -> Int {

    return { y -> x + y }

}



