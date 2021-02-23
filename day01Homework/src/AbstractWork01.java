public class AbstractWork01 {
    public static void main(String[] args) {
        Weapon tank = new Tank();
        Weapon flight = new Flight();
        Weapon warship = new WarShip();
        tank.attach();
        tank.move();
        flight.attach();
        flight.move();
        warship.attach();
        warship.move();
    }
}
abstract class Weapon{
    //攻击方式
    public abstract void attach();
    //移动方式
    public abstract void move();
}
class Tank extends Weapon{
    public void attach(){
        System.out.println("坦克的攻击方式：大炮");
    }
    public void move(){
        System.out.println("坦克的移动方式：地上跑");
    }
}
class Flight extends Weapon{
    public void attach(){
        System.out.println("飞机的攻击方式:导弹");
    }
    public void move(){
        System.out.println("飞机的移动方式：天上飞");
    }
}
class WarShip extends Weapon{
    public void attach(){
        System.out.println("战舰的攻击方式：鱼雷");
    }
    public void move(){
        System.out.println("战舰的移动方式：海上游");
    }
}