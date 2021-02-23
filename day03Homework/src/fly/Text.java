package fly;

public class Text {
    public static void main(String[] args) {
        Plane plane = new Plane();
        new Text().makeFly(plane);
        Bird bird = new Bird();
        new Text().makeFly(bird);
    }
    public void makeFly(CanFly c) {
        c.fly();

    }
}
