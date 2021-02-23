package peflect;

import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
       // ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
        ResourceBundle bundle = ResourceBundle.getBundle("bean/db");
        String className = bundle.getString("className");
        System.out.println(className);
    }
}
