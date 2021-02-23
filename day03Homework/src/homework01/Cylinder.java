package homework01;

public class Cylinder implements C {
    private int radius;
    private int height;
    private String color;

    public Cylinder() {
    }

    public Cylinder(int radius, int height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void volume() {
        System.out.println("体积：" +area()*height);

    }

    @Override
    public double area() {
        return PI * this.radius * this.radius;
    }

    @Override
    public String setColor(String c) {
        return c;

    }
}
