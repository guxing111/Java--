package homework05;

import java.util.HashMap;
import java.util.Map;

/**
 * 5.有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
 * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}
 */
public class HomeWork05 {
    public static void main(String[] args) {
        String[] str1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < str1.length; i++) {
            String Ma = str1[i];
            String Mb = str2[i];
            map.put(Ma,Mb);
        }
        System.out.println(map);
    }
}
