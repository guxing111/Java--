package fly;

public class Plane implements CanFly {
    @Override
    public void fly() {
        System.out.println("我是飞机我能飞");
    }


}
class Bird implements CanFly{
    public void fly(){
        System.out.println("我是鸟我能飞");
    }
}
