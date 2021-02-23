package danLink;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }
        List list2 = new LinkedList();
        list2.add("123");
        list2.add("456");
        list2.add("789");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
