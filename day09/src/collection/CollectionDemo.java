package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 关于java.util.Collection接口中的常用方法
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //测试Collection接口中的常用方法
        //add（）往集合中加元素
        c.add(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(true);
        //获取几个中元素的个数
        System.out.println("集合中的元素个数：" +c.size());
        c.clear();
        System.out.println("集合中的元素个数：" +c.size());
        c.add("Hello");
        c.add("world");
        c.add(1);
        boolean flag =  c.contains("Hello");
        System.out.println(flag);
        boolean flag2 = c.contains("oinboi");
        System.out.println(flag2);
        System.out.println(c.contains(1));
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println(c.isEmpty());//true
        c.add("asd");
        c.add("def");
        c.add(100);
        c.add("awe");
        c.add(new Student());
        System.out.println("__________________________________________");
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }
}
class Student{

}
