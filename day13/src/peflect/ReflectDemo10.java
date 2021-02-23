package peflect;

import service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo10 {
    public static void main(String[] args) throws Exception{
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin","123");
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
        Class userServiceClass = Class.forName("service.UserService");
        Object obj = userServiceClass.newInstance();
        Method loginMethod = userServiceClass.getDeclaredMethod
                ("login", String.class, String.class);


        Object retValue = loginMethod.invoke(obj, "admin","123");

        System.out.println(retValue);

    }
}
