package javase.string;

public class IntegerDemo01 {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(100);
        doSome(myInt);
    }

    private static void doSome(Object obj) {
        System.out.println(obj);
    }
}
