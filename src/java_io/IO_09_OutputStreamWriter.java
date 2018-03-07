package java_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 10:52
 * Dsc:
 */
public class IO_09_OutputStreamWriter {

    public static void main(String[] args) {

        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("09.txt"), "utf-8");

            osw.write("abcdef");

            osw.flush();

            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
