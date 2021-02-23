package peflect;

public class ArgsDemo01 {
    public static void main (String[] args){
        m();
        m(10);
        m(10,20);
    }
    public static void m (int... args){
        System.out.println("m方法执行了");
    }
    public static void m2 (String... args){

    }
}
