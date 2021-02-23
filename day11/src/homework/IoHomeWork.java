package homework;

import java.io.*;

public class IoHomeWork {
    public static void main(String[] args) {
        File f1 = new File("E:\\JavaSEWorkingSpace\\day03\\src");
        File f2 = new File("D:\\");
        
        copy(f1,f2);
    }

    private static void copy(File f1, File f2) {
        if (f1.isFile()){
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(f1);
                String path = (f2.getAbsolutePath().endsWith("\\")?f2.getAbsolutePath():f2.getAbsolutePath()+"\\") +f1.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024];
                int DataNum = 0;
                while ((DataNum = fis.read(bytes)) != -1){
                    fos.write(bytes,0,DataNum);
                }

                fos.flush();
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
                if (fos != null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        /*File[] files = f1.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                String s = file.getAbsolutePath();
                String s2 = (f2.getAbsolutePath().endsWith("\\") ? f2.getAbsolutePath() : f2.getAbsolutePath()+"\\") + s.substring(3);
                File newFile = new File(s2);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copy(file,f2);
        }*/
        File[] files = f1.listFiles();
        for(File file : files){
            // 获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                // 新建对应的目录
                //System.out.println(file.getAbsolutePath());
                //D:\course\02-JavaSE\document\JavaSE进阶讲义       源目录
                //C:\course\02-JavaSE\document\JavaSE进阶讲义       目标目录
                String srcDir = file.getAbsolutePath();
                String destDir = (f2.getAbsolutePath().endsWith("\\") ? f2.getAbsolutePath() : f2.getAbsolutePath() + "\\")  + srcDir.substring(3);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            // 递归调用
            copy(file, f2);
        }

    }
}
