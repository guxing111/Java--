package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo02 {
    public static void main(String[] args) {
        List<Animal> myList = new ArrayList<>();
        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }

    }
}
