package java_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 10:15
 * Dsc:
 */
public class IO_08_InputStreamReader {

    public static void main(String[] args) {

        try {
            FileInputStream   fis = new FileInputStream("05.txt");
            InputStreamReader isr = new InputStreamReader(fis,"GBK");
            int               len = 0;
            while ((len = isr.read()) != -1) {
                System.out.println((char) len);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
