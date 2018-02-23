fun main(args: Array<String>) {


    val outClass1 = OutClass1()
    val inClass1 = OutClass1().InClass()
    inClass1.sayHello()

}

class OutClass1 {
    val name = "zs"

    inner class InClass {
        val name = "ls"
        fun sayHello() {

            println("Hello $name")
        }
    }
}