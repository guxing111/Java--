package javase.exceptionwork;

public class UserService {
    String[] name = new String[20];
    String[] pass = new String[20];
    public void register(String username,String password) throws MySignInException {
        //获取用户名的密码长度
        int nameLength = username.length();
        int passwordLength = password.length();
        if (username == null || password == null){
            throw new MySignInException("用户名和密码不能为空！");

        }
        if (nameLength < 6 || nameLength > 14){
            throw new MySignInException("注册的用户名不符合规范，长度应该在6——14字符之间");
        }
        if (passwordLength < 8 || passwordLength >16){
            throw new MySignInException("密码不符合规范，长度应该在8——16字符之间");

        }
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null && pass[i] == null){
                name[i] = username;
                pass[i] = password;
                System.out.println("注册成功");
                return;
            }
        }
        throw new MySignInException("注册已达上限。" );
    }
}
