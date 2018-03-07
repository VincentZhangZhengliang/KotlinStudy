package java_io;

import java.io.*;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 11:17
 * Dsc:
 */
public class IO_10_SystemIn {


    public static void main(String[] args) {

//        demo1();

//        demo2();

//        test1();




    }

    private static void test1() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("10.txt")));

            int    len  = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demo2() {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("10_1.txt"), "GBK"));
            bw.write("abcdefg");
            bw.newLine();
            bw.write("sssssss");

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demo1() {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int            len = 0;
        try {

            while ((len = br.read()) != -1) {
                System.out.println((char) len);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
