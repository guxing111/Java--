package bean;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        Student s = new Student(1111,"zhangsan");
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day11/studends");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
