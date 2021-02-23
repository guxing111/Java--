package collection;

public class ForEachDemo01 {
    public static void main(String[] args) {
        int[] arr = {222,123,5,321,34,52,37,15,1,32,};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("_________________________________");
        for (int data: arr) {
            System.out.println(data);
        }
    }
}
