package ch04

import kotlin.reflect.KProperty

/**
 *  Package:ch04
 *  User:Vincent
 *  Date:2018/2/23 17:11
 *  Dsc:
 */



fun main(args: Array<String>) {

    val bigSon = BigSon()

    val smallFather = SmallFather(bigSon)

    smallFather.wash()

}




interface IWash {
    fun wash()
}


class BigSon : IWash {

    val money: Int by SmallFather(this)

    override fun wash() {
        println("大头儿子洗碗")
    }

}

class SmallFather(var iWash: IWash) : IWash by iWash {

    var bigSonMoney = 0

    operator fun getValue(bigSon: BigSon, property: KProperty<*>): Int {
        return bigSonMoney
    }

    operator fun setValue(bigSon: BigSon, property: KProperty<*>, value: Int) {
        bigSonMoney = value
    }

}