package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(2222,"zhaoliu");
        map.put(7777,"lisi");
        map.put(6666,"wangwu");
        map.put(2222,"KING");
        System.out.println(map.size());
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
