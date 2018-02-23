package day02.homework

/**
 *  Package:day02.homework
 *  User:Vincent
 *  Date:2017/10/31 21:54
 *  Dsc:
 */

fun main(args: Array<String>) {


    sum(1, 2, 3, 4, 5, 6)

}

fun sum(vararg args: Int) {

    args.forEachIndexed { index, i ->

        println("index = $index,i = $i")

    }


}