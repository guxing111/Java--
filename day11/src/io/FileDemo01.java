package io;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1 = new File("D:/a/as/s/d/f");
        System.out.println(f1.exists());
        if (!f1.exists()){
            f1.mkdirs();
        }
    }
}
