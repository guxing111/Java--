package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //文件路径：E:\Working space\FileInpurStream\temp
        try {
            fis = new FileInputStream("E:\\Working space\\FileInputStream\\temp");
            int readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
            readData = fis.read();
            System.out.println(readData);
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
