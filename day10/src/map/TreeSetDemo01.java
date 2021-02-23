package map;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhaoliu");
        ts.add("aaa");
        for (String s : ts){
            System.out.println(s);
        }
        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(1315641);
        ts2.add(254);
        ts2.add(23156);
        ts2.add(215);
        ts2.add(33);
        for (Integer ter : ts2){
            System.out.println(ter);
        }
    }
}
