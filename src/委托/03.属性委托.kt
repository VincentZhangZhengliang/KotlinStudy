package 委托

import kotlin.reflect.KProperty

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2017/11/24 10:47
 *  Dsc:
 */


class NormalPropertiesDemo {

    var content: String = "Normal Properties init content"

}

class DelegatePropertiesDemo {

    var content: String by Content()

    override fun toString(): String {
        return "DelegatePropertiesDemo Class"
    }
}

class Content {

    operator fun getValue(delegatePropertiesDemo: DelegatePropertiesDemo, property: KProperty<*>): String {

        return "$delegatePropertiesDemo property '${property.name}'  = 'balalala。。。。' "

    }

    operator fun setValue(delegatePropertiesDemo: DelegatePropertiesDemo, property: KProperty<*>, s: String) {

        println("$delegatePropertiesDemo property '${property.name}' is setting value : '$s'")

    }


}

fun main(args: Array<String>) {

    val normalPropertiesDemo = NormalPropertiesDemo()
    println(normalPropertiesDemo.content)
    normalPropertiesDemo.content = "Lao tze"
    println(normalPropertiesDemo.content)

    val delegatePropertiesDemo = DelegatePropertiesDemo()
    println(delegatePropertiesDemo.content)
    delegatePropertiesDemo.content = "Confucius"
    println(delegatePropertiesDemo.content)


}