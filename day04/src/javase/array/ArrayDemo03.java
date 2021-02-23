package javase.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        printArray(x);
        String[] str = {"asd", "qwe", "zxc", "fgh"};
        printArray(str);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
