fun main(args: Array<String>) {
    val animal1: Animal = Dog()
    animal1.call()
    val animal2: Animal = Cat()
    animal2.call()

}

abstract class Animal {
    abstract fun call()
}

class Dog : Animal() {
    override fun call() {
        println("汪汪汪")
    }
}

class Cat : Animal() {
    override fun call() {
        println("喵喵喵")
    }
}