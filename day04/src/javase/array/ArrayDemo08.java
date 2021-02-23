package javase.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        int [][] a = {
                {100,200,300},
                {30,20,40,50},
                {6,7,8,9},
                {0}
        };
        //System.out.println(a.length);
        /*
        int [] a0 = a[0];
        int a00 = a0[0];
        System.out.println(a00);
        System.out.println(a[3][0]);
        */
        for (int i = 0; i < a.length; i++) {
//            int [] array0 = a[i];
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
