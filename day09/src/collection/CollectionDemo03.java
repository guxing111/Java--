package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.remove(4);
        Iterator it = c.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        Collection c1 = new HashSet();
        c1.add(100);
        c1.add(200);
        c1.add(30);
        c1.add(20);
        c1.add(30);
        c1.add(55);
        Iterator it2 = c1.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
