package 委托

/**
 *  Package:委托
 *  User:Vincent
 *  Date:2017/11/24 11:19
 *  Dsc:
 */


val synchronizedLazyImpl = lazy {
    println("lazy value synchronized1 3!")
    println("lazy value synchronized1 2!")
    println("lazy value synchronized1 1!")
    "Hello,Lazy value Synchronized1 "
}


fun main(args: Array<String>) {

    val lazyValueSynchronized1: String by synchronizedLazyImpl
    println(lazyValueSynchronized1)
    println(lazyValueSynchronized1)


    val lazyValueSynchronized2: String by lazy {
        println("lazyValueSynchronized2")
        println("lazyValueSynchronized2")
        println("lazyValueSynchronized2")
        "Hello,lazyValueSynchronized2"
    }


    println(lazyValueSynchronized2)
    println(lazyValueSynchronized2)

}