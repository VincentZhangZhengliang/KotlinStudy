package java_io;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 9:04
 * Dsc:
 */
public class IO_06_FileInputStream {


    public static void main(String[] args) {

//        demo1();

        try {
            FileInputStream fis = new FileInputStream("05.txt");

            byte[] chs = new byte[1024];

            int len = 0;

            while ((len = fis.read(chs)) != -1) {

                System.out.println(new String(chs, 0, len));

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void demo1() {
        try {
            FileInputStream fis = new FileInputStream("05.txt");

            int len = 0;

            while ((len = fis.read()) != -1) {
                System.out.println((char) len);
            }

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
