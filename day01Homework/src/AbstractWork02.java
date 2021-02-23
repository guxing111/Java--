public class AbstractWork02 {
    public static void main(String[] args) {
        Graphical circular = new Circular("绿色",true,3);
        System.out.println(circular.toString());
        Graphical rectangle = new Rectangle("红色",false,10.0,5.0);
        System.out.println(rectangle.toString());
        Graphical square = new Square("黄色",false,4.0);
        System.out.println(square.toString());
    }
}
abstract class Graphical{
    private String colour;   //定义颜色
    private boolean fill;    //定义是否填充
    public abstract double perimeter();     //获取图形周长的抽象方法
    public abstract double area();          //获取图形面积的抽象方法
    public abstract  String toString();

    public Graphical() {
    }

    public Graphical(String colour, boolean fill) {
        this.colour = colour;
        this.fill = fill;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
}
//正方形
class Square extends Graphical{
    private double side;

    public Square(String colour, boolean fill, double side) {
        super(colour, fill);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4*this.side;
    }

    @Override
    public double area() {
        return this.side*this.side;
    }
    public String toString(){
        return "正方形的颜色为：" +getColour()
                +"，有无填充：" +isFill()
                + "，边长为：" +this.side
                + ",周长为：" +perimeter()
                + "，体积为：" +area();
    }
}
//长方形
class Rectangle extends Graphical{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String colour, boolean fill, double length, double width) {
        super(colour, fill);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (this.length + this.length) * 2;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "长方形的颜色为：" +getColour()
                + "，有无填充：" +isFill()
                + "，长为：" +getLength()
                + "，宽为：" +getWidth()
                + "，周长为：" +this.perimeter()
                + "，体积为：" +this.area();
    }
}
//圆形
class Circular extends Graphical{
    private double R;

    public Circular(double r) {
        R = r;
    }

    public Circular(String colour, boolean fill, double r) {
        super(colour, fill);
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public double perimeter() {
        return R*2*3.14;
    }

    @Override
    public double area() {
        return R*R*3.14;
    }

    @Override
    public String toString() {
        return "圆的颜色为：" +getColour()
                +"，有无填充：" +isFill()
                + "，半径为：" +this.R
                + "，周长为：" +this.perimeter()
                + "，体积为：" +this.area();
    }
}
