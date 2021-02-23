package map;

import java.util.TreeSet;

public class TreeSetDemo04 {
    public static void main(String[] args) {
        Vip vip = new Vip("zhangsna",20);
        Vip vip2 = new Vip("lisi",33);
        Vip vip3 = new Vip("wangwu",15);
        Vip vip4 = new Vip("zhaoliu",20);
        TreeSet<Vip> ts = new TreeSet<>();
        ts.add(vip);
        ts.add(vip2);
        ts.add(vip3);
        ts.add(vip4);
        for (Vip v : ts){
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip vip) {
        if (this.age == vip.age){
            return this.name.compareTo(vip.name);
        }else{
            return this.age - vip.age;
        }
    }
}