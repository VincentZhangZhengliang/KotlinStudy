fun main(args: Array<String>) {
    val animal1: IAnimal = IDog()
    call(animal1)
    val animal2: IAnimal = ICat()
    call(animal2)


}

//动物叫
fun call(animal: IAnimal) {

    if (animal is IDog)
        animal.wangwang()
    else if (animal is ICat)
        animal.miaomiao()

}

open class IAnimal {

}

class IDog : IAnimal() {
    fun wangwang() {
        println("狗汪汪叫")
    }
}

class ICat : IAnimal() {
    fun miaomiao() {
        println("猫喵喵叫")
    }
}