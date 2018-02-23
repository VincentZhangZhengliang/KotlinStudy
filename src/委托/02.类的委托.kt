package 委托

import java.util.*

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2017/11/24 10:37
 *  Dsc:
 */


interface Subject {
    fun hello()
}

class RealSubject(val name: String) : Subject {
    override fun hello() {
        println("Hello,Real $name ! Now is ${Date()}")
    }
}

class ProxySubject(val sub: Subject) : Subject by sub {

    override fun hello() {
        println("Before ! Now is ${Date()}")
        sub.hello()
        println("After ! Now is ${Date()}")
    }

}

fun main(args: Array<String>) {

    val subject = RealSubject("World")
    subject.hello()

    val proxySubject = ProxySubject(subject)
    proxySubject.hello()

}