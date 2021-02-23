package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(9,"lisi");
        map.put(1,"shimis");
        map.put(2,"wangwu");
        map.put(3,"sanofi");
        map.put(4,"zhaoliu");
        map.put(5,"lili");
        System.out.println(map.size());
        System.out.println(map.get(1));
        Set<Integer> keys = map.keySet();
        /*Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }*/
        for (Integer key : keys){
            System.out.println(key + "=" +map.get(key));
        }
        System.out.println("_________________");
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> node : entries){
            System.out.println(node.getKey() + "=" +node.getValue());
        }
    }
}
