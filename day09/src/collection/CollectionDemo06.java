package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);

        /*while (it.hasNext()){
            Object obj = it.next();
            it.remove();
            System.out.println(obj);
        }
        System.out.println(c.size());*/
        c.remove(1);
        Iterator it = c.iterator();
        System.out.println(c.size());
        while(it.hasNext()){
            Object obj = it.next();
            it.remove();
            System.out.println(obj);
        }
        System.out.println(c.size());
    }
}
