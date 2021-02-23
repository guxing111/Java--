package review;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(300);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(3);
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
