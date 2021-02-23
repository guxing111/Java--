package array;

import java.util.Arrays;

public class ArrayText {
    public static void main(String[] args) {
        int[] arr = {1,2,39,3,5,51,651,31,56,321,658,4,561};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int index = Arrays.binarySearch(arr,321);
        System.out.println((index == -1) ? "该元素不存在" : "该元素在：" +index);
    }
}
