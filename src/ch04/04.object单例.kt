package ch04


/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/24 9:39
 *  Dsc:
 */

fun main(args: Array<String>) {

//    val p = Person
//    val p1 = Person
//
//    println(p)
//    println(p1)
//
//    println("____设置属性____")
//    p.name = "阿珂"
//    p1.name = "芈月"
//
//    println("____取出属性____")
//    println(p.name)
//    println(p1.name)
//
//    val btn = Button()
//
//    btn.setOnClickListener(object : OnClickListener {
//        override fun onClick() {
//
//        }
//    })

    val gougou = object : Animal("狗狗") {

        override fun eat() {
//            super.eat()
            println("吃骨头")
        }

    }
    gougou.eat()


    val per = object {
        val name = "韩信"
        val age = 23
    }

    println(per.name)
    println(per.age)

}


object Person {

    var name: String = ""
    var age: Int = 0

}


interface OnClickListener {

    fun onClick()

}


class Button {

    fun setOnClickListener(listener: OnClickListener) {
        listener.onClick()
    }

}


open class Animal(var name: String) {

    open fun eat() {

        println("吃吃吃。。。")

    }

}
