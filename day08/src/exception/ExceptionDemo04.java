package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\p'c\\Pictures\\111\\1.png");
            String s  = null;
            s.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (fis != null){
                try{
                    fis.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Hello");
    }
}
