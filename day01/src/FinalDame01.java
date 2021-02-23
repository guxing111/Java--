public class FinalDame01 {
    public static void main(String[] args) {
        Person per = new Person(20);
        System.out.println("年龄：" +per.age);

        final  Person p = new Person(30);


    }
}
class Person{
    int age;
    public Person(){

    }
    public Person(int age) {
        this.age = age;
    }
}