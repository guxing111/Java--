package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        Set<Integer> keys = map.keySet();
        /*Iterator<Integer> it = keys.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" +value);
        }*/
        for (Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }


        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        /*while (it2.hasNext()){
            Map.Entry<Integer,String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" +value);

        }*/
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey() + "--->" +node.getValue());
        }
    }
}
