package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo14 {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        Thread t = new Thread(task);
        t.start();
        try {
            Object obj = task.get();
            System.out.println(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
