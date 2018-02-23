fun main(args: Array<String>) {
    val outClass = OutClass()

    val inClass2 = OutClass2().InClass()
    inClass2.sayHello()

}

class OutClass2 {
    var name = "张三"

    inner class InClass {
        var name = "李四"
        fun sayHello() {
            println(name)
        }
    }
}