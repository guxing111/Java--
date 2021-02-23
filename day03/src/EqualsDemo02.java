public class EqualsDemo02 {
    public static void main (String[] args){
        Student s1 = new Student("111","中南林业科技大学");
        Student s2 = new Student("111","中南林业科技大学");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

}
class Student{
    private String id;
    private String school;
    public Student() {
    }
    public Student(String id, String school) {
        this.id = id;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return school;
    }

    public void setStudent(String student) {
        this.school = student;
    }
    public String toString(){
        return "学号：" + id +"，所在学校名称：" +school;
    }
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Student))  return false;
        if (this == obj)  return true;
        Student s = (Student)obj;
        return this.id == s.id && this.school.equals(s.school);
    }

}
