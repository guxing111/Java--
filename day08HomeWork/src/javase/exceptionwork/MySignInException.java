package javase.exceptionwork;

public class MySignInException extends Exception{
    public MySignInException() {
    }
    public MySignInException(String s){
        super(s);
    }
}
