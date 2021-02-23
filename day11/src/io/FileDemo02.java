package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo02 {
    public static void main(String[] args) {
        File f1 = new File("D:\\hunhe\\1、毕业论文怎么写.doc");
        System.out.println("文件名：" +f1.getName());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());


        long haoMiao = f1.lastModified();
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);
        System.out.println(f1.length());
    }
}
