package javase.array;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 22, 4};
        int[] dest = new int[20];
       // System.arraycopy(src,1,dest,3,2);
        System.arraycopy(src,0,dest,0,src.length);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        String[] str = {"hello","World", "study", "java" , "mysql", "oracle", "jdbc"};
        String[] newStr = new String[20];
        System.arraycopy(str,0,newStr,0,str.length);
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }

    }
}
