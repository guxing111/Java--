package homewor01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] > 10){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+ (i + 1) +"个数是："+arr[i]);
        }
        System.out.println(list);
    }
}
