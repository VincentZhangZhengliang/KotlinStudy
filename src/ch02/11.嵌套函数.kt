package ch02

/**
 *  Package:ch02
 *  User:Vincent
 *  Date:2018/2/23 10:38
 *  Dsc:
 */


class User(var name: String, var password: String)

fun validate(value: String, fieldName: String) {
    if (value.isEmpty())
        throw IllegalArgumentException("不能保存用户，${fieldName}为空")
}

fun saveUser(user: User) {
    validate(user.name, "用户名")
    validate(user.password, "密码")
}

fun main(args: Array<String>) {
//    saveUser(User("kotlin", ""))
    saveUser1(User("kotlin", ""))
}

/**
 * 嵌套函数
 */
fun saveUser1(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("不能保存用户，${fieldName}为空")
    }
    validate(user.name, "用户名")
    validate(user.password, "密码")
}
