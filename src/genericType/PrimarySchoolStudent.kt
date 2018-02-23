package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/22 10:48
 *  Dsc:
 */
class PrimarySchoolStudent(var name: String, var age: Int) {

    constructor(name: String) : this(name, 0) {

        println("name = $name, age = $age")

    }

}