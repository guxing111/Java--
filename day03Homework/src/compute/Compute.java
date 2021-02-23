package compute;

interface Compute {
    int compute (int n, int m);
}
class Plus implements Compute{
    @Override
    public int compute(int n, int m) {
        return n + m;
    }
}
class Reduce implements Compute{
    @Override
    public int compute(int n, int m) {
        return n - m;
    }
}
class Ride implements Compute{
    @Override
    public int compute(int n, int m) {
        return n * m ;
    }
}
class Except implements Compute{
    @Override
    public int compute(int n, int m) {
        if (m != 0){
            return n / m;
        }else {
            System.out.println("输入数值错误");
            return 0;
        }
    }
}