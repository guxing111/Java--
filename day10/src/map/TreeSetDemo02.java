package map;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(50);
        Person p3 = new Person(30);
        Person p4 = new Person(60);
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);             //java.lang.ClassCastException
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        for (Person p : ts){
            System.out.println(p);
        }
    }
}
class Person implements Comparable{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[" +
                "age=" + age +
                ']';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
