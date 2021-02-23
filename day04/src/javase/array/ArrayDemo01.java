package javase.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] a= { 1, 100, 20, 50, 30, 55};
        System.out.println("数组中元素的个数" +a.length);
        System.out.println("第一个元素 " +a[0]);
        System.out.println("最后一个元素 " +a[a.length-1]);
        a[0] = 111 ;
        a[a.length-1] = 0;
        System.out.println("第一个元素 " +a[0]);
        System.out.println("最后一个元素 " +a[a.length-1]);
        //一维数组遍历
        for (int i = 0;i < a.length; i++){
            System.out.println(a[i]);
        }
        //颠倒遍历
        for (int i = a.length-1;i>=0;i--){
            System.out.println("遍历颠倒：" +a[i]);
        }

    }
}
