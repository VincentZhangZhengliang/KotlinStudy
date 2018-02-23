package 委托

import kotlin.reflect.KProperty
import kotlin.reflect.jvm.javaField

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2018/1/8 17:21
 *  Dsc:
 */

class Delegate {
    operator fun getValue(example: Example, property: KProperty<*>): String {
        return property.name
    }

    operator fun setValue(example: Example, property: KProperty<*>, s: String) {
        property.javaField
    }


}

class Example {
    var P: String by Delegate()

    val propLazy: Int by lazy { 1 }
}

fun main(args: Array<String>) {

    val e = Example()
    e.P = "ss"
    println(e.P)


}