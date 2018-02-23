package java;

/**
 * Package:java
 * User:Vincent
 * Date:2017/11/22 16:21
 * Dsc:
 */
public class Singleton {

    //1.私有构造
    private Singleton() {
    }

    //2.创建实例
    private static Singleton instance;

    //3.提供对外访问的方法
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }


    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
