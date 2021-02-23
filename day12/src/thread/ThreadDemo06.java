package thread;

public class ThreadDemo06 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread(myThread2);
        t.setName("t");
        t.start();

        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello world!!!");
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "------>" +i);
        }
    }
}