public class FinalDemo03 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        System.out.println(MyMath.PI);

    }
}
class Chinese{
    String idCard;
    String name;
    //静态常量，要求大写，
    public static final String COUNTRY = "中国";
}
class MyMath{
    public static final double PI = 3.1415926535;
}
