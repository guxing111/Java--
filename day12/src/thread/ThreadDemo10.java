package thread;

public class ThreadDemo10 {
    public static void main(String[] args) {
        /*System.out.println("最高优先级：" +Thread.MAX_PRIORITY);
        System.out.println("最低优先级：" +Thread.MIN_PRIORITY);
        System.out.println("默认优先级：" +Thread.NORM_PRIORITY);*/
        Thread currentTread = Thread.currentThread();
        Thread.currentThread().setPriority(1);
        //System.out.println(currentTread.getName() +"线程的默认优先级是：" +currentTread.getPriority());
        Thread t = new Thread(new MyRunnable5());
        t.setPriority(10);
        t.setName("t");
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+ "---->" +i);
        }

    }
}
class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName() + "线程的默认优先级:" +Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+ "---->" +i);
        }


    }
}