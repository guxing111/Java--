package javase.string;

public class StringBufferDemo01 {
    public static void main(String[] args) {
        //String s = "";
        /*
        for (int i = 0; i < 100; i++) {
            s += i;
            System.out.println(s);
        }
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        System.out.println(stringBuffer);
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
        System.out.println(stringBuffer);
    }
}
