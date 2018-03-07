package java_io;

import java.io.*;
import java.util.Properties;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 11:41
 * Dsc:
 */
public class IO_11_Properties {


    public static void main(String[] args) {

//        demo1();


        Properties properties = new Properties();

        try {
            properties.load(new BufferedReader(new FileReader("Count.prop")));

            String count = properties.getProperty("count");

            int i = Integer.parseInt(count);

            System.out.println(i);

            if (i > 0) {
                --i;
                properties.setProperty("count", i + "");
                properties.store(new OutputStreamWriter(new FileOutputStream("Count.prop")),"");

            }else{

                System.out.println("您的次数已使用完!");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void demo1() {
        Properties properties = new Properties();

        properties.setProperty("name", "zs");
        properties.setProperty("age", "23");
//        properties.propertyNames()

//        properties.stringPropertyNames();

        //            properties.list(new PrintStream(new FileOutputStream("11.txt")));
        properties.list(System.out);

        try {
            properties.load(new InputStreamReader(new FileInputStream("11.txt")));
            properties.list(System.out);

            properties.store(new OutputStreamWriter(new FileOutputStream("11_1.txt")), "store");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
