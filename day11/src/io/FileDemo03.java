package io;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f = new File("D:\\hunhe");
        File[] files = f.listFiles();
        for (File file : files){
            System.out.println(file.getAbsolutePath());
        }

    }
}
