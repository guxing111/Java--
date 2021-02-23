package homework03;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * 姓名（String）年龄（int）分数（float）
 * liusan			20				90.0F
 * lisi			22				90.0F
 * wangwu			20				99.0F
 * sunliu			22				100.0F
 */
public class homework03 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student stu1 = new Student(20,90.0f,"liusan");
        Student stu2 = new Student(22,90.0f,"lisi");
        Student stu3 = new Student(20,99.0f,"wangwu");
        Student stu4 = new Student(22,100.0f,"sunliu");
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        for (Student student :treeSet){
            System.out.println(student);
        }
    }
}
class Student implements Comparable<Student>{
    private int age;
    private float number;
    private String name;

    public Student() {
    }

    public Student(int age, float number, String name) {
        this.age = age;
        this.number = number;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public int compare(Student o1, Student o2) {
        *//*if (o2.getNumber() - o1.getNumber() == 1) return 1;
        if (o2.getNumber() - o1.getNumber() == 0){
            return o1.getAge()-o2.getAge();
        }
        if (o2.getNumber() - o1.getNumber() == -1) return -1;*//*
        int n1=(int) (o1.getNumber()-o2.getNumber());
        int n2=o1.getAge()-o2.getAge();
        return n1==0?n2:n1;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.number, number) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, number, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int n1=(int) (o.getNumber()-this.getNumber());
        int n2=this.getAge()-o.getAge();
        return n1==0?n2:n1;
    }
}