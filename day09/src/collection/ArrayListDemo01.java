package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo01 {
    public static void main (String[] args){
        //底层先创建了一个长度为10的数组，当添加第一个元素的时候，初始化容量10
        List list1 = new ArrayList();
        System.out.println(list1.size());
        List list2 = new ArrayList(20);
        System.out.println(list2.size());
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.size());

    }
}
