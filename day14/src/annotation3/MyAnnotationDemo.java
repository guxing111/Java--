package annotation3;

@MyAnnotation
public class MyAnnotationDemo {
    @MyAnnotation
    int t;

    @MyAnnotation
    @Override
    public String toString() {
        return "MyAnnotationDemo{" +
                "t=" + t +
                '}';
    }
}
