package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoHomeWork02 {
    public static void main(String[] args) throws Exception {
        //拷贝源
        File filesrc=new File("D:\\FileDmeo");
        //拷贝目标
        File filedest=new File("E:\\");
        //调用递归
        copyDirectory(filesrc,filedest);

    }


    //创建递归方法
    public static void copyDirectory(File src,File dest) {
        //src是文件，执行文件复制，递归结束
        if (src.isFile()) {
            //新建字节的输入、输出流
            FileInputStream in=null;
            FileOutputStream out=null;

            try {
                //in的路径是src
                in=new FileInputStream(src);
                //拼接 目的地 的路径
                String path=(dest.getAbsolutePath().endsWith("\\")? dest.getAbsolutePath() : dest.getAbsolutePath()+"\\") + src.getAbsolutePath().substring(3);
                out =new FileOutputStream(path);

                //一边读一边写，每次传1MB
                byte[] bytes=new byte[1024*1024];
                int DataNum=0;
                //写入
                while (((DataNum=in.read(bytes))!=-1)){
                    out.write(bytes,0,DataNum);
                }
                //刷新管道，防止数据丢失
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                //关闭输出管道
                if (out!=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                //关闭输入管道
                if (in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            return;
        }

        //src是目录，递归继续
        //取出当前目录下的所有文件名
        File[] files = src.listFiles();
        for (File file : files) {
            //如果文件是目录，则在目标地新建目录
            if(file.isDirectory()){
                //这是源文件夹的，绝对路径
                String srcfile=file.getAbsolutePath();
                //在目标地，按源文件夹的方式，新建文件夹
                //xx.substring(3),可以去掉前3个盘符：D:\
                String destfile=(dest.getAbsolutePath().endsWith("\\") ? dest.getAbsolutePath() : dest.getAbsolutePath()+"\\") + srcfile.substring(3);

                //新建File对象，目标地 按 原文件夹方式
                File newfile=new File(destfile);

                //如果文件夹不存在，则新建多重目录
                if(!newfile.exists()){
                    newfile.mkdirs();
                }
            }

            //继续递归调用，进入下一级目录
            copyDirectory(file,dest);

        }

    }
}
