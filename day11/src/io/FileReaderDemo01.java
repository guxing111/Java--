package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("day11/TempFile");
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount =reader.read(chars)) != -1){
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
