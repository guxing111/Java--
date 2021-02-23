package review;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        set.add("afv");
        set.add("abd");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("_________________");
        for (String s : set){
            System.out.println(s);
        }
        Set<Student> students = new HashSet<>();
        Student s1 = new Student(111,"zhangsan");
        Student s2 = new Student(222,"lisi");
        Student s3 = new Student(333,"wangwu");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Iterator<Student> it2 = students.iterator();
        while (it2.hasNext()){
            Object student = (Student) it2.next();
            System.out.println(student);
        }
        /*for (Student student : students){
            System.out.println(student);
        }*/
        Set<Student> student = new HashSet<>();
    }
}
class Student{
    int no;
    String name;
    public Student(){

    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
