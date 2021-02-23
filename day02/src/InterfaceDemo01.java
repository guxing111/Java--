public class InterfaceDemo01 {
    public static void main(String[] args) {
        MyMath mm = new MyMathImpl();
        System.out.println(mm.sum(22,5));
        System.out.println(mm.sub(22,5));
    }
}
interface MyMath{
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}
class MyMathImpl implements MyMath{
    @Override
    public int sub(int a, int b) {
        return a + b;
    }

    @Override
    public int sum(int a, int b) {
        return a - b;
    }
}