package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/22 11:15
 *  Dsc:
 */
class Teacher(name: String, age: Int,override var addr: String) : Person(name, age) {

//    override var addr: String = "hangzhou"
//        set(value) {
//            field = "ShenZhen"
//        }
//        get() {
//            return "WuHan"
//        }

    override val weight: Float
        get() = 10.0f

    override fun doEat() {
    }

    override fun doWalk() {
    }

    override fun doSleep() {
        super.doSleep()
    }

}