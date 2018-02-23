package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/21 9:02
 *  Dsc:
 *
 *  out :生产者：保证读取数据时类型安全的对象  ? extends T
 *  in  :消费者，保证写入数据时类型安全的对象  ? super T
 *
 */

fun main(args: Array<String>) {

    var student = Student("sss", 22)

    var middleSchoolStudent = MiddleSchoolStudent("ss", 23)

    var middleSchoolStudent1 = MiddleSchoolStudent()

    var primarySchoolStudent = PrimarySchoolStudent("ss")

    var world = World()

    println(world.yin)
    println(world.yang)
    println(world.plus())

}








