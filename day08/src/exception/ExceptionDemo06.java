package exception;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空!");
        e.printStackTrace();
        String str = e.getMessage();
        System.out.println(str);
    }
}
