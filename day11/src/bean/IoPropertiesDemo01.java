package bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/*
Io和Properties的联合应用
 */
public class IoPropertiesDemo01 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("day11/userinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        String username = pro.getProperty("username");
        System.out.println(username);
        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
