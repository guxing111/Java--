package homework2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception{
        Num num = new Num();
        Thread t1 = new Thread(new A1(num));
        Thread t2 = new Thread(new A2(num));
        t1.setName("偶数线程");
        t2.setName("奇数线程");

        t1.start();
        t2.start();
    }
}
