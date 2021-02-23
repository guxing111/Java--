package javase.string;

public class StringDemo02 {
    public static void main(String[] args) {
            char c = "中国人".charAt(1);
        System.out.println(c);
        int result = "abc".compareTo("abc");
        System.out.println(result);
        int result2 = "abcd".compareTo("abce");
        System.out.println(result2);

    }
}
