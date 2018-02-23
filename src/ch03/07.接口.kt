package ch03

/**
 *  Package:ch03
 *  User:Vincent
 *  Date:2018/2/23 15:18
 *  Dsc:
 */


interface Clickable {

    fun click()

    fun show() = println("clickable")

}

interface Touchable {

    fun touch()

    fun show() = println("touchable")

}

class Button : Clickable, Touchable {

    override fun touch() {
        println("button touch")
    }

    override fun click() {
        println("button click")

    }

    override fun show() {
        super<Clickable>.show()
        super<Touchable>.show()
    }

}

fun main(args: Array<String>) {

    val b = Button()
    b.touch()
    b.click()
    b.show()


}