package thread;

public class ThreadDemo05 {
    public static void main(String[] args) {
        /*try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!!!");*/
        for (int i =  0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "----->" +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
