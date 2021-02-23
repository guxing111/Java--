package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {

            m1();
            String s = null;
            s.toString();
            System.out.println("SSSSSSSSS");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
        }catch (IOException e){
           e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally{
            System.out.println("SSSSSSSSSSS");

        }
        System.out.println("main end");
    }

    private static void m1() throws IOException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    private static void m2() throws IOException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 end");
    }

    private static void m3() throws IOException {
        //创建一个输入流对象
        FileInputStream fis = new FileInputStream("E:\\BaiDuNetDiskDownload\\01-JavaSE基础阶段\\01-老杜2020版Java零基础685集（视频采用JDK13录制）\\001-JavaSE课堂笔记+思维导图\\07-JavaSE进阶每日复习与笔记\\day27课堂笔记.txt");
        System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！");
        fis.close();
    }
}
