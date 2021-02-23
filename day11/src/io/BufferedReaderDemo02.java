package io;

import java.io.*;

public class BufferedReaderDemo02 {
    public static void main(String[] args) {
        /*FileInputStream fis = null;
        InputStreamReader reader = null;*/
        BufferedReader br = null;
        try {
            /*fis = new FileInputStream("day11/src/io/CopyDemo01.java");
            reader = new InputStreamReader(fis);
            br = new BufferedReader(reader);*/
            br = new BufferedReader(new InputStreamReader(new FileInputStream("day11/src/io/CopyDemo01.java")));
            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
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
