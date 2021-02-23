package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        Iterator it = c.iterator();
       /* boolean hasNext =  it.hasNext();
        if (hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }*/
       while(it.hasNext()){
           Object obj = it.next();
           System.out.println(obj);
       }
    }
}
