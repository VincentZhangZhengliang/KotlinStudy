package genericType

/**
 *  Package:genericType
 *  User:Vincent
 *  Date:2017/11/22 10:15
 *  Dsc:
 */
class Student constructor(var name: String, var age: Int) {

    init {
        println("Student{name=$name,age = $age}")
    }

    public constructor(name: String, age: Int, address: String) : this(name, age) {

    }

}