import java.util.Objects;

public class EqualsDemo01 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        System.out.println(a == b);
        MyTime t1 = new MyTime(2008,8,8);
        MyTime t2 = new MyTime(2008,8,8);
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
        MyTime t3 = new MyTime(2009,8,8);
        System.out.println(t1.equals(t3));
    }
}
class MyTime {
    private int year;
    private int month;
    private int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        MyTime myTime = (MyTime) obj;
        return year == myTime.year &&
                month == myTime.month &&
                day == myTime.day;
        /*int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
        if (obj instanceof MyTime){
            MyTime t = (MyTime)obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if (year1 == year2 && month1 == month2 && day1 == day2){
                return true;
            }
        }
        return false;*/

    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
