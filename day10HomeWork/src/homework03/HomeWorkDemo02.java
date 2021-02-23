package homework03;

import java.util.Comparator;
import java.util.TreeSet;

public class HomeWorkDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2) {
                int n1=(int) (o2.getNumber()-o1.getNumber());
                int n2=o1.getAge()-o2.getAge();
                return n1==0?n2:n1;
            }
        });
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
