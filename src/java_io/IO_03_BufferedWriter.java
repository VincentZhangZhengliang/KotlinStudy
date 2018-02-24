package java_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/24 17:24
 * Dsc:
 */
public class IO_03_BufferedWriter {

    public static void main(String[] args) {

        FileWriter     fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("03.txt");
            bw = new BufferedWriter(fw);
            bw.write("adcdefg");
            bw.flush();
            bw.close();
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
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
