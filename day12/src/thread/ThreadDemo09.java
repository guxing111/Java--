package thread;

public class ThreadDemo09 {
    public static void main(String[] args) {
        MyRunnable4 mr = new MyRunnable4();
        Thread t = new Thread(mr);
        t.setName("MyRunnable4");
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mr.run = false;

    }
}
class MyRunnable4 implements Runnable{

    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "------>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{

                return;
            }
        }
    }
}