package 继承

/**
 *  Package:继承
 *  User:Vincent
 *  Date:2017/11/22 14:54
 *  Dsc:
 */


open class Base {}

class SubClass : Base() {}

open class Father(var name: String) {

    open fun doSomething() {}

}

class Son(name: String) : Father(name) {

    final override fun doSomething() {
        super.doSomething()
    }
}