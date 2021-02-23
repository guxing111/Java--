package javase.integer;

public class DateDemo02 {
    public static void main(String[] args) {
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长" +(end - begin) +"毫秒");
    }
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            //System.out.println("i=" +i);
        }
    }
}
