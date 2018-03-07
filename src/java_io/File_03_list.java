package java_io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 13:48
 * Dsc:
 */
public class File_03_list {

    public static void main(String[] args) {

        File file = new File("E:\\IO");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return !name.contains("01");
            }
        });

//        for (String s : list) {
//            System.out.println(s);
//        }

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.length() == 0;
            }
        });

        for (File file1 : files) {
            listFile(file1);
        }

    }

    public static void listFile(File file) {
        if (file.isDirectory()) {

            File[] files = file.listFiles();

            for (File file1 : files) {
                listFile(file1);
            }

        } else if (file.isFile()) {

            System.out.println(file.getPath());
        }
    }


}
