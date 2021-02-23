package homework2;

import java.util.ArrayList;
import java.util.List;

public class Num {
    int i = 1;
}
class A1 extends Num implements Runnable{
    private Num num;

    public A1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized(num) {
                if (num.i % 2 == 1) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + "----->" + (num.i++));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();
            }
        }
    }
}
class A2 extends Num implements Runnable{
    private Num num;

    public A2(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized(num) {
                if (num.i % 2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "----->" + num.i++);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();


            }
        }
    }
}
