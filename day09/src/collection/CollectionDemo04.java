package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println("元素中的个数：" +c.size());
        String x = new String("abc");
        System.out.println(c.contains(x));
    }
}
