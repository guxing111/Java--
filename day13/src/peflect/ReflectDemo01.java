package peflect;

import java.util.Date;

public class ReflectDemo01 {
    public static void main(String[] args) {
/*
        获取Class的第一种方法:
            Class c = Class.forName("完整类名带包名")
 */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    /*
        第二种:
            Class c = 对象.getClass();
        */
        String s = "abc";
        Class x = s.getClass();
        System.out.println(c1 == x);

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y);

        //第三种方式，java语言中任何一种类型，包括基本数据类型，都有。class属性。
        Class z = String.class;
        Class k = Date.class;
        System.out.println(z == x);
    }
}
