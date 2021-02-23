package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(null,null);
        System.out.println(map.size());
    }
}
