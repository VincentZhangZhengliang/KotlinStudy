package 匿名内部类

/**
 *  Package:匿名内部类
 *  User:Vincent
 *  Date:2017/11/24 9:59
 *  Dsc:
 */


class NestedClassesDemo {

    class AnonymousInnerClassDemo {


        fun doRun() {

            Thread(Runnable {
                println("doRun : I am Running")

            }).start()
        }


        fun doStop() {
            Thread {
                println("DDDDDDDDDDDD")
            }.start()
        }


        fun doWait() {
            val runnable = Runnable {
                println("WWWWWW")
            }
            Thread(runnable).start()
        }

        fun doNotify() {

            val wait = {
                println("NNNNNN")
            }

            Thread(wait).start()

        }

    }


}

fun main(args: Array<String>) {


    NestedClassesDemo.AnonymousInnerClassDemo().doStop()
    NestedClassesDemo.AnonymousInnerClassDemo().doRun()
    NestedClassesDemo.AnonymousInnerClassDemo().doWait()
    NestedClassesDemo.AnonymousInnerClassDemo().doNotify()


}