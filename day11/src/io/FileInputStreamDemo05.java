package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("day11/TempFile");
            //System.out.println("总字节数量：" +fis.available());
            //int readByte = fis.read();
            //System.out.println("剩下多少字节没读：" +fis.available());
            //byte[] bytes = new byte[fis.available()];
            //int readByte = fis.read(bytes);
            //System.out.println(new String(bytes));
            fis.skip(3);
            byte[] bytes = new byte[fis.available()];
            int readByte = fis.read(bytes);
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
