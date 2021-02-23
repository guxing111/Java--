package javase.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        printArray(a);
        int[] b = new int[4];
        printArray(b);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
