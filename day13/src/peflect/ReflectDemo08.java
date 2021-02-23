package peflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo08 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("service.UserService");
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods){
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType());
            System.out.println(method.getName());
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType : parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
