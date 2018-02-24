package java_io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/24 17:15
 * Dsc:
 */
public class IO_02_FileReader {


    public static void main(String[] args) {
//        demo1();

        demo2();

    }

    private static void demo2() {
        FileReader fr = null;
        try {
            fr = new FileReader("01.txt");
            int    len   = 0;
            char[] chars = new char[1024];

            while ((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void demo1() {
        FileReader fr = null;
        try {
            fr = new FileReader("01.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
