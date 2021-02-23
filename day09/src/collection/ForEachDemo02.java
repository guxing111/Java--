package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world!");
        strList.add("ads");
        Iterator<String> it = strList.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
