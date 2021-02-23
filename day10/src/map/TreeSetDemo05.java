package map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo05 {
    public static void main(String[] args) {
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.age - o2.age;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(810));
        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}
class WuGui{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }

}
/*
class WuGuiComparator implements Comparator<WuGui> {

    @Override
    public int compare(WuGui o1,WuGui o2) {
        return o1.age - o2.age;
    }
}*/
