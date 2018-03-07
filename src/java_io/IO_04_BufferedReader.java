package java_io;

import java.io.*;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/24 17:32
 * Dsc:
 */
public class IO_04_BufferedReader {

    public static void main(String[] args) {

//        demo1();
//        demo2();
        demo3();

    }

    private static void demo3() {
        FileReader       fr  = null;
        MyBufferedReader mbr = null;
        try {
            fr = new FileReader("04_copy.txt");
            mbr = new MyBufferedReader(fr);

            String line = null;
            while ((line = mbr.myReadLine()) != null) {
                System.out.println(line);
            }
            mbr.MyClose();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (mbr != null) {
                try {
                    mbr.MyClose();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void demo2() {
        FileReader     fr = null;
        BufferedReader br = null;
        FileWriter     fw = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("03.txt");
            br = new BufferedReader(fr);

            fw = new FileWriter("04_copy.txt");
            bw = new BufferedWriter(fw);

            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
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

    private static void demo1() {
        FileReader     fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("03.txt");
            br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class MyBufferedReader {

    private Reader reader;

    public MyBufferedReader(Reader reader) {
        this.reader = reader;
    }

    public String myReadLine() throws IOException {

        StringBuilder builder = new StringBuilder();

        int ch = 0;

        while ((ch = reader.read()) != -1) {

            if (ch == '\r')
                continue;
            if (ch == '\n')
                return builder.toString();
            else
                builder.append((char) ch);

        }

        if (builder.length() != 0)
            return builder.toString();

        return null;
    }

    public void MyClose() throws IOException {
        reader.close();
    }

}


