package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("jack");
        User u2 = new User("jack");
        c.add(u1);
        System.out.println(c.contains(u2));
        Integer x = new Integer(10000);
        Integer y = new Integer(10000);
        c.add(x);
        System.out.println(c.contains(y));
        Collection cc = new ArrayList();
        String s1 = "ads";
        String s2 = "ads";
        cc.add(s1);
        cc.remove(s2);
        System.out.println(cc.size());

    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

}
