package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:\\Working space\\jiekou\\src\\InstanceofDemo01.java");
            fos = new FileOutputStream("D:\\java\\InstanceofDemo01.java");

            byte[] bytes = new byte[100 * 1024];
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }


            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
