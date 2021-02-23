package thread;

public class ThreadDemo11 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6());
        t.setName("t");
        t.start();


        for (int i = 1; i <= 10000; i++) {
            System.out.println(Thread.currentThread().getName() +"-------->" +i);
        }
    }
}
class MyRunnable6 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            if (i % 100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() +"-------->" +i);
        }
    }
}