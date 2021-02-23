package peflect;

import java.lang.reflect.Constructor;

public class ReflectDemo12 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("bean.Vip");
        Object obj = c.newInstance();
        System.out.println(obj);
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class, boolean.class);
        Object newObj = con.newInstance(110,"jackson" , "2000-06-30", true);
        System.out.println(newObj);

        Constructor con2 = c.getDeclaredConstructor();
        Object newObj2 = con2.newInstance();
        System.out.println(newObj2);

    }
}
