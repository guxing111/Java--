package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list);
        list.add("abc");
        list.add("abz");
        list.add("abw");
        list.add("abf");
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }
    }
}
