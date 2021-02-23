package thread;

public class ThreadDemo04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 1000; i++){
                    System.out.println("t线程--->" +i);
                }
            }
        });
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" +i);
        }
    }
}
