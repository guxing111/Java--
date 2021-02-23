package javase.integer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo03 {
    public static void main(String[] args) {
        Date time = new Date(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = simpleDateFormat.format(time);
        System.out.println(time);
        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        String strTime2 = simpleDateFormat.format(time2);
        System.out.println(strTime2);

    }
}
