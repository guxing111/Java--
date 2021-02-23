public class AbstractDemo01 {
    public static void main(String[] args) {
        Account a = new CreditAccount();
        a.withdraw();
    }
}
//银行账户类
abstract class Account{
    public abstract void withdraw();
}
class CreditAccount extends Account{
    public void withdraw(){
        System.out.println("Bird");
    }

}
