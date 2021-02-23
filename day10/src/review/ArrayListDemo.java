package review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");
        String firstElt = list.get(0);
        System.out.println(firstElt);
        for (int i = 0; i < list.size(); i++) {
            String elt = list.get(i);
            System.out.println(elt);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : list){
            System.out.println(s);
        }

    }
}
