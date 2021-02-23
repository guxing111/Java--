package javase.string;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "Hello World!!!";
        byte[] bytes = {97, 98, 99};
        String s2 = new String(bytes);
        System.out.println(s2);
        String s3 = new String(bytes,1,2);
        System.out.println(s3);
        char[] chars = {'我', '是', '中', '国','人'};
        String s4 = new String(chars,2,3);
        System.out.println(s4);
    }
}
