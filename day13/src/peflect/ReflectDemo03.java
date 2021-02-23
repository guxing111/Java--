package peflect;

import java.io.FileReader;
import java.util.Properties;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("day13/classinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);

        reader.close();
        String className = pro.getProperty("className");
        //System.out.println(className);
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}