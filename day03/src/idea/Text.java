package idea;

public class Text {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.mySum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 200);
    }
}
