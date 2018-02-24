package java_io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/24 17:09
 * Dsc:
 */
public class IO_01_FileWriter {

    public static void main(String[] args) {
//        demo1();
        FileWriter fw = null;
        try {
            fw = new FileWriter("01_1.txt");
            fw.write("abcdefgh");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void demo1() throws IOException {
        FileWriter fw = new FileWriter("01.txt");

        fw.write("abcde");

        fw.flush();

        fw.close();
    }


}
