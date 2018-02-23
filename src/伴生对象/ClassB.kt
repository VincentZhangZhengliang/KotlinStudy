package 伴生对象

/**
 *  Package:伴生对象
 *  User:Vincent
 *  Date:2017/11/23 15:19
 *  Dsc:
 */
class ClassB {

    companion object {
        fun create(): ClassB = ClassB()
        fun get() = "Hi, I am CompanyB"
    }

}

class ClassC {

    var index = 0

    fun get(): Int {
        return 0
    }

    companion object CompanyC {
        fun create(): ClassC = ClassC()
        fun get() = "Hi, I am CompanyC"
    }

}

fun main(args: Array<String>) {

    println(ClassD.create())

    ClassD.CompanyD.create()

    //伴生对象属性和函数调用
    ClassD.CompanyD.name
    ClassD.name
    ClassD.create()
    ClassD.CompanyD.create()

    //原对象的属性和函数调用
    var classD = ClassD()
    classD.name
    classD.create()


}


interface BeanFactoy<T> {
    fun create(): T
}

class ClassD {

    var name: String = javaClass.name

    fun create() = 2

    companion object CompanyD : BeanFactoy<ClassD> {

        var name: String = javaClass.name


        override fun create(): ClassD {
            return ClassD()
        }
    }

}