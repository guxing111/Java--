package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo01 {
    public static void main(String[] args) {
        /*
        List myList = new ArrayList();
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Cat){
                Cat cat = (Cat)obj;
                cat.catchMouse();
            }else {
                Bird bird = (Bird)obj;
                bird.fly();
            }
        }
         */
        List<Animal> myList = new ArrayList<Animal>();
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
           // a.move();
            if (a instanceof Cat){
                Cat x = (Cat)a;
                x.catchMouse();
            }
            if (a instanceof Bird){
                Bird y = (Bird)a;
                y.fly();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("移动");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("飞翔");
    }
}