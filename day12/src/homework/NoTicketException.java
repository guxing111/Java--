package homework;

/**
 * 自定义异常类
 */
public class NoTicketException extends Exception {
    public NoTicketException() {
    }

    public NoTicketException(String s) {
        super(s);
    }
}
