package peflect;

import java.lang.reflect.Field;

public class ReflectDemo07 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("bean.Student");
        Object obj = studentClass.newInstance();
        Field noFiled = studentClass.getDeclaredField("no");
        noFiled.set(obj,222222222);
        System.out.println(noFiled.get(obj));
        Field nameField = studentClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"jackson");
        System.out.println(nameField.get(obj));


    }
}
