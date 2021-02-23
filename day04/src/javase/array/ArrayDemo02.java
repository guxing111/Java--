package javase.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] a = new int[4];
        int x = 0;
        for (int i = 0; i < a.length; i++){
            x += 4;
            System.out.println("数组下标为" +i+ "的元素是：" +x);
        }
        Object[] obj = new Object[3];
        for (int i = 0; i < obj.length; i++){
            System.out.println(obj[i]);
        }
        String[] str = {"asd","fgh","jkl"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1,o2,o3};
        for (int i = 0; i < obj.length; i++) {
            System.out.println(objects[i]);

        }
    }
}
