package review;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("ur2","ashdouabudob");
        pro.setProperty("driver","com.mysql");
        pro.setProperty("username","root");
        pro.setProperty("password","123");
        String ur2 = pro.getProperty("ur2");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(ur2);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
