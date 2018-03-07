package java_io;

import java.io.File;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 14:25
 * Dsc:
 */
public class File_05_delete {

    public static void main(String[] args) {

        File file = new File("E:\\IO\\file_02");
        deleteAll(file);

    }

    private static void deleteAll(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleteAll(file1);
            }
        }
        file.delete();
    }

}
