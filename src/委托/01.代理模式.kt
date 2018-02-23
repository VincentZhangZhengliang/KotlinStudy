package 委托

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2017/11/24 10:17
 *  Dsc:委托模式的作用是将委托者与实际实现代码分离出来，以达成解耦的目的。
 */


interface JSubject {
    fun request()
}

class JRealSubject : JSubject {

    override fun request() {
        println("JRealSubject Requesting")
    }
}

class JProxy(sub: JSubject) : JSubject {

    var subject: JSubject? = null

    init {
        subject = sub
    }


    override fun request() {

        this.before()
        this.subject!!.request()
        this.after()
    }

    private fun before() {
        println("JProxy Before Requesting")
    }

    private fun after() {
        println("JProxy after Requesting")
    }

}

fun main(args: Array<String>) {

    val jRealSubject = JRealSubject()

    val jProxy = JProxy(jRealSubject)

    jProxy.request()


}




