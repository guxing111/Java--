package javase.number;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo02 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        while (a < array.length){
            int num = random.nextInt(101);
            if (comtoin(array,num)){
                array[a++] = num;
            }

        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static boolean comtoin(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return false;
            }

        }
        return true;
    }

}
