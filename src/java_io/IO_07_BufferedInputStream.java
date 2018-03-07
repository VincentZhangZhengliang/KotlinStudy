package java_io;

import java.io.*;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 9:12
 * Dsc:
 */
public class IO_07_BufferedInputStream {

    public static void main(String[] args) {

        try {
            FileInputStream     fis = new FileInputStream("aa.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream     fos = new FileOutputStream("aa_copy.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int len = 0;

            while ((len = bis.read()) != -1) {
                bos.write(len);
                bos.flush();
            }

            bis.close();
            bos.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
