package 单例

import java.io.File

/**
 *  Package:单例
 *  User:Vincent
 *  Date:2017/11/22 17:18
 *  Dsc:
 */
class DataProcessor {

    fun process() {
        println("Process Data")
    }

    object FileUtils {

        val userHome = "/Users/jack/"

        fun getFileContent(file: String): String {
            var content = ""
            val f = File(file)
            f.forEachLine { content = content + it + "\n" }
            return content
        }
    }


    companion object StringUtils {

        fun isEmpty(s: String): Boolean {
            return s.isEmpty()
        }

    }
}


fun main(args: Array<String>) {
    println(DataProcessor.FileUtils.userHome)
    println(DataProcessor.isEmpty("sss"))
    println(DataProcessor.isEmpty("sss"))
}