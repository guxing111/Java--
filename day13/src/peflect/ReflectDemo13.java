package peflect;

public class ReflectDemo13 {
    public static void main(String[] args) throws Exception{
        Class stringClass = Class.forName("java.lang.String");

        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());

        Class[] interfaces = stringClass.getInterfaces();
        for (Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
