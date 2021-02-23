package compute;

public class Text {
    public static void main(String[] args) {
        UseCompute use = new UseCompute();
        Plus plus = new Plus();
        Reduce reduce = new Reduce();
        Ride ride = new Ride();
        Except except = new Except();
        System.out.println("加法：");
        use.useCom(plus,50,30);
        System.out.println("减法：");
        use.useCom(reduce,50,30);
        System.out.println("乘法：");
        use.useCom(ride,50,30);
        System.out.println("除法：");
        use.useCom(except,50,25);
    }
}
