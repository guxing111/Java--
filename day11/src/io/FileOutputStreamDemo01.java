package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream("day11/myfile");
            fos = new FileOutputStream("day11/myfile1",true);
            byte[] bytes = {97,98,99,100,101};
            fos.write(bytes);
            fos.write(bytes,0,2);
            String s = "我是中国人；";
            byte[] bt = s.getBytes();
            fos.write(bt);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
