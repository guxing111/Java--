package collection;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        //List vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        Iterator it = vector.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        List myList = new ArrayList();
        Collections.synchronizedList(myList);
        myList.add("111");
        myList.add("222");
        myList.add("333");

    }
}
