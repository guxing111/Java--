package javase.integer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        Date nowTime = new Date();
        //SimpleDateFormat是java.text包下专门负责格式化的
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = simpleDateFormat.format(nowTime);
        System.out.println(nowTimeStr);
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = simpleDateFormat1.parse(time);
        System.out.println(date);
    }
}
