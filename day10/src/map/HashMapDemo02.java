package map;

import java.util.HashSet;
import java.util.Set;

public class HashMapDemo02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        System.out.println(s1.equals(s2));

        System.out.println("s1 hashCode " + s1.hashCode());
        System.out.println("s1 hashCode " +s2.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());

    }
}
