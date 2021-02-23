package peflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class vipClass = Class.forName("bean.Vip");
        s.append(Modifier.toString(vipClass.getModifiers()) + " class " + vipClass.getSimpleName());

        s.append("{\n");
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType :parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length > 0) {
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }

        s.append("}");
        System.out.println(s);

    }
}
