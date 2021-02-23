package peflect;

public class ReflectDemo04 {
    public static void main(String[] args) {
        try {
            Class.forName("peflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}