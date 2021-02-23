package thread;

public class ThreadDemo13 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setDaemon(true);
        t.setName("备份数据的线程");
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +"-------->" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class BakDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(Thread.currentThread().getName() + "--->" +(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}