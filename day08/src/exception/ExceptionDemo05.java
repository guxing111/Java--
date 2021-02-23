package exception;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }
    public static int m(){
        int i = 100;
        try{
            return i;
        }finally{
            i++;
        }
    }
}
