package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/22 13:49
 *  Dsc:
 */
abstract class Human {

    abstract var name: String
    abstract var age: Int

}


class Man : Human() {
    override var name: String = "zhangsan"
    override var age: Int = 23
}


class Woman(override var name: String, override var age: Int) : Human() {}

class Child : Human() {
    override var name: String = "张三"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    override var age: Int = 23
        get() = field
        set(value) {
            field = value
        }
}