package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            out = new FileWriter("day11/file",true);
            char[] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars,2,3);
            out.write("我是java软件工程师");
            out.write("\n");
            out.write("Hello World!!!");

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
