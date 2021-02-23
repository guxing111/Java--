package javase.string;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(100);
        stringBuilder.append("sad");
        stringBuilder.append(3.14);
        System.out.println(stringBuilder);

    }
}
