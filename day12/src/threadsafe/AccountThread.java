package threadsafe;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象。
    private Account act;
    public AccountThread(Account act){
        this.act = act;
    }

    @Override
    public void run() {
        double money = 5000;
        act.withdraw(money);
        //System.out.println("线程：" +Thread.currentThread().getName());
        System.out.println("线程：" +Thread.currentThread().getName()+"账户"+act.getName()+"取款成功，余额" + act.getBalance());
    }
}
