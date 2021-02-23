package annotation;

@MyAnnotation
public class AnnotationDemo {
    @MyAnnotation
    private int no;

    public AnnotationDemo() {
    }

    @Override
    public String toString() {
        return "AnnotationDemo{" +
                "no=" + no +
                '}';
    }
}
