package annotation3;

public class ReflectAnnotationDemo {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("annotation3.MyAnnotationDemo");
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));

        if (c.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象：" +myAnnotation);
            String v = myAnnotation.value();
            System.out.println(v);
        }
    }
}
