package threadsafe;

public class Account {
    private String name ;
    private double balance;

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //取款的方法
    public void withdraw(double money) {
        synchronized (this) {
            //取款之前的余额
    double before = this.getBalance();
    //取款之后的余额
    double after = before - money;

            try {
                    Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
            }
                    //更新余额
                    this.setBalance(after);
        }
    }
}
