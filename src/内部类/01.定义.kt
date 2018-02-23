package 内部类

/**
 *  Package:内部类
 *  User:Vincent
 *  Date:2017/11/24 9:48
 *  Dsc:
 */
class NestedClassesDemo {

    class Outer {

        private val zero: Int = 0

        val one: Int = 1

        inner class Inner {

            fun accessOuter() {
                println(zero)
                println(one)
            }

        }

    }
}

fun main(args: Array<String>) {
    NestedClassesDemo.Outer().Inner().accessOuter()


}

