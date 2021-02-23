package javase.number;

import java.text.DecimalFormat;

public class DecimalFormatDemo01 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
        String s = decimalFormat.format(1234.56123132);
        System.out.println(s);
        DecimalFormat decimalFormat1 = new DecimalFormat("###,###.0000");
        String s1 = decimalFormat1.format(1234.22);
        System.out.println(s1);
    }
}
