package java_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Package:java_io
 * User:Vincent
 * Date:2018/2/26 14:44
 * Dsc:
 */
public class IO_13_RandomAccessFile {


    public static void main(String[] args) {

//        demo1();

        demo2();


    }

    private static void demo2() {
        File file = new File("13.txt");

        try {
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));


            List<MsgBean> msgBeans = (List<MsgBean>) ois.readObject();

            for (MsgBean msgBean : msgBeans) {
                System.out.println(msgBean);
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void demo1() {
        File file = new File("13.txt");

        List<MsgBean> msgBeans = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            msgBeans.add(new MsgBean(1, "top" + i));
        }

        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(msgBeans);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class MsgBean implements Serializable {

    private int    id;
    private String content;

    public MsgBean(int id, String content) {
        this.id = id;
        this.content = content;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MsgBean{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
