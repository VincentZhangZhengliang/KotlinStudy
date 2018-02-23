package 单例

import sun.misc.BASE64Encoder
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.*

/**
 *  Package:单例
 *  User:Vincent
 *  Date:2017/11/22 16:47
 *  Dsc:
 */
object AdminUser {


    val username: String = "admin"
    val password: String = "admin"


    fun getTimestamp() = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())

    fun md5Password() = EncoderByMd5(password + getTimestamp())


    fun EncoderByMd5(string: String): String {

        val md5 = MessageDigest.getInstance("MD5")

        val basE64Encoder = BASE64Encoder()

        val newStr = basE64Encoder.encode(md5.digest(string.toByteArray(Charsets.UTF_8)))

        return newStr

    }


}


fun main(args: Array<String>) {

    println(AdminUser.username)

    println(AdminUser.password)

    println(AdminUser.getTimestamp())

    println(AdminUser.md5Password())

}