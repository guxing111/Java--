package javase.array;

public class ArrayDemo06 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animal ={a1, a2};
        for (int i = 0; i < animal.length; i++) {
            Animal a = animal[i];
            a.mian();
        }
        Animal[] animals = {new Cat(),new Bird()};
        for (int i = 0; i < animals.length; i++) {
//            Animal an = animals[i];
//            an.mian();
            if (animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];
                cat.catcher();
            }else if (animals[i] instanceof Bird){
                Bird bird = (Bird)animals[i];
                bird.fly();
            }
        }
    }
}
class Animal{
    public void mian(){
        System.out.println("Animal move...");
    }
}
class Cat extends Animal{
    public void mian(){
        System.out.println("cat");
    }
    public void catcher(){
        System.out.println("zhualaoshu");
    }
}
class Bird extends Animal{
    public void mian(){
        System.out.println("bird");
    }
    public void fly(){
        System.out.println("bird fly!!");
    }
}