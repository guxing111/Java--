package thread;

public class ThreadDemo08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("MyRunnable3");
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();
    }
}
class MyRunnable3 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "------>" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
