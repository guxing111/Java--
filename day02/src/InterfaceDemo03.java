public class InterfaceDemo03 {
    public static void main(String[] args) {
        Flyable fly = new Cat();
        fly.fly();
        Flyable f = new Pig();
        f.fly();
    }
}
class Animal{

}
interface Flyable{
    void fly();
}
class Cat extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("起飞");
    }
}
class Snake extends Animal {

}
class Pig extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞猪");
    }
}
class Fish extends Object implements Flyable{
    @Override
    public void fly() {

    }
}