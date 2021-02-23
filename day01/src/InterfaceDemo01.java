public class InterfaceDemo01 {
    public static void main(String[] args) {
        System.out.println(MyMath01.PI);

    }
}
interface A{

}
interface B{

}
interface C extends A,B{

}
interface MyMath01{
    public abstract int sum(int a, int b);
    public static final double PI = 3.1415926;
}