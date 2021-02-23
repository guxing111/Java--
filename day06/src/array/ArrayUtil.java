package array;

import static java.util.Arrays.binarySearch;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {100, 200, 230, 235, 600, 1000, 2000, 9999};
        int index = binarySearch1(arr, 235);
        System.out.println(index == -1 ? "该元素不存在!" : "元素下标：" +index);
    }

    private static int binarySearch1(int[] arr, int dest) {
        int begin = 0;
        int end = arr.length-1;
        while(begin <= end) {
            int mid = (begin + end) / 2;

            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {
                begin = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
