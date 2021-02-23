package homework02;

import java.util.Iterator;
import java.util.LinkedList;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] str = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        list.remove("67891");
        list.remove("12347809933");
        for (String s :list){
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
