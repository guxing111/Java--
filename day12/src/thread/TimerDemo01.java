package thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date firstTime = sdf.parse("2021-02-01 10:20:30");
            timer.schedule(new LogTimerTask(), firstTime, 1000*10);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份！");
    }
}
