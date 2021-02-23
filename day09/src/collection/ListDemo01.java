package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("c");
        myList.add("c");
        myList.add("D");
        myList.add(1,"KING");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object ect = it.next();
            System.out.println(ect);
        }
        Object firstObj =  myList.get(0);
        System.out.println(firstObj);
        for (int i = 0 ; i < myList.size() ; i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }
        System.out.println(myList.indexOf("KING"));
        System.out.println(myList.indexOf("c"));
        System.out.println(myList.lastIndexOf("c"));
        myList.remove(0);
        System.out.println(myList.size());
        System.out.println("________________________________________");
        myList.set(2,"Soft");
        for (int i = 0 ; i < myList.size() ; i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
