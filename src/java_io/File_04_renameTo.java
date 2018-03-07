package java_io;

import java.io.File;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 14:17
 * Dsc:
 */
public class File_04_renameTo {

    public static void main(String[] args) {

        File file1 = new File("E:\\IO\\file_02", "01.txt");
        System.out.println(file1.exists());
        File file2 = new File("E:\\IO\\file_02", "02.txt");
        System.out.println(file2.exists());

        boolean b = file2.renameTo(file1);

        System.out.println(b);


    }

}
