public class InterfaceDemo02 {
    public static void main(String[] args) {
        A a = new D();
        B b = new D();
        C c = new D();
        B b2 = (B)a;
        b2.m2();

    }
}
interface A{
    void m1();
}
interface B{
    void m2();
}
interface C{
    void m3();
}
class D implements A,B,C{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }
}
