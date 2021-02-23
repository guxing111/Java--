package peflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo09 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class userServiceClass = Class.forName("service.UserService");
        s.append(Modifier.toString(userServiceClass.getModifiers()) + " class " +userServiceClass.getSimpleName() + "{\n");
        //s.append(" ");
        Method[] methods = userServiceClass.getDeclaredMethods();
        for (Method method : methods){
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType : parameterTypes){
                //System.out.println(parameterType.getSimpleName());

                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            //s.deleteCharAt(s.length() - 1);
            s.append("){}\n");

        }
        s.append("\n}");
        System.out.println(s);
    }
}
