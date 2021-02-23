package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDEmo01 {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("day11/src/io/CopyDemo01.java");
            br = new BufferedReader(reader);
            /*String firstLine = br.readLine();
            System.out.println(firstLine);*/
            String s = null;
            while ((s = br.readLine()) != null){
                System.out.println(s +"\t");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
