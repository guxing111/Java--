package homework01;

public class Text {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(1,2,"red");
        c.volume();
        System.out.println(c.area());
        System.out.println(c.getColor());
    }
}
