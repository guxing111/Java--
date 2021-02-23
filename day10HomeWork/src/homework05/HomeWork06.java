package homework05;

import java.util.*;

/**
 * 6.定义一个泛型为String类型的List集合，统计该集合中每个字符
 * （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，
 * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class HomeWork06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("absgbi");
        list.add("abiufabf");
        method(list);
    }

    private static void method(List<String> list) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char[] c = s.toCharArray();
            for (char c1 : c){
                if (map.containsKey(c1)){
                    map.put(c1,map.get(c1)+1);
                }else{
                    map.put(c1,1);
                }
            }
        }
        Set<Character> set = map.keySet();
        for (char c2 : set){
            System.out.println(c2 + "=" +map.get(c2));
        }
    }
}
