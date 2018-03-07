package java_io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 8:58
 * Dsc:
 */
public class IO_05_FileOutputStream {


    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("05.txt");
            fos.write("abcdef".getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
