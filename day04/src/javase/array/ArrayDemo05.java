package javase.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("请输入用户名和密码信息");
            return;
        }
        String username = args[0];
        String password = args[1];
        //可能会出现空指针异常
//        if(username.equals("admin") && password.equals("123")){
        //可以避免空指针异常
        if ("admin".equals(username)  && "123".equals(password)){
            System.out.println("登录成功，欢迎[" +username+ "]回来");
        }else{
            System.out.println("输入的账户密码不正确" );
        }
    }
}
