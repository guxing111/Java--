package map;

import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        Customer c1 = new Customer(32);
        Customer c2 = new Customer(13);
        Customer c3 = new Customer(25);
        Customer c4 = new Customer(27);
        Customer c5 = new Customer(19);
        TreeSet<Customer> ts = new TreeSet<>();
        ts.add(c1);
        ts.add(c2);
        ts.add(c3);
        ts.add(c4);
        ts.add(c5);
        for (Customer c : ts){
            System.out.println(c);
        }
    }
}
class Customer implements Comparable<Customer>{
    int age;

    public Customer(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer c) {
        /*int age1 = this.age;
        int age2 = c.age;
        if (age1 == age2){
            return 0;

        }else if (age1 > age2){
            return 1;

        }else{
            return -1;
        }*/
        //升序
       // return this.age - c.age;
        //降序
        return c.age - this.age;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "age=" + age +
                ']';
    }
}
