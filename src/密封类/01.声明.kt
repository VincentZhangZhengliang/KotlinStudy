package 密封类

/**
 *  Package:密封类
 *  User:Vincent
 *  Date:2017/11/23 15:57
 *  Dsc:
 */


sealed class Expression

class Uint : Expression()

data class Const(val number: Double) : Expression()

data class Sum(val e1: Expression, val e2: Expression) : Expression()

data class Multiply(val e1: Expression, val e2: Expression) : Expression()

object Nan : Expression()


fun main(args: Array<String>) {


    println(eval(Uint()))

}

fun eval(expr: Expression): Double = when (expr) {

    is Uint -> 1.0
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is Multiply -> eval(expr.e1) * eval(expr.e2)
    is Nan -> Double.NaN
}