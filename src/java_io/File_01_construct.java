package java_io;

import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 13:33
 * Dsc:
 */
public class File_01_construct {

    public static void main(String[] args) {

//        demo1();

        File file = new File("file_01_1.txt");
        URI  uri  = file.toURI();
        System.out.println(uri);


    }

    private static void demo1() {
        File file  = new File("E:\\IO", "file_01.txt");
        File file2 = new File("\\file_01.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            boolean newFile1 = file2.createNewFile();
            System.out.println(newFile1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
