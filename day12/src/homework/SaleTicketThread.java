package homework;

public class SaleTicketThread extends Thread {
    private  Ticket ticket;

    public SaleTicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 60; i++){
            try {
                String s = ticket.saleTicket();
                System.out.println(Thread.currentThread().getName() + "买票成功---------->" +s);
            } catch (NoTicketException e) {
                System.out.println(Thread.currentThread().getName() + "买票时发生异常！");
                e.printStackTrace();
                break;
            }
        }
    }
}
/**
 * private Ticket ticket;
 *
 *     public SaleTicketThread(String name, Ticket ticket) {
 *         super(name);
 *         this.ticket = ticket;
 *         this.start();
 *     }
 *
 *     // 在run方法中卖车票
 *     public void run() {
 *         for (int i = 0; i < 60; i++) {
 *             try {
 *                 String s = ticket.saleTicket();
 *                 System.out.println(this.getName() + "卖票成功========>" + s);
 *             } catch (NoTicketException e) {
 *                 System.out.println(this.getName() + " 卖票时发生异常!");
 *                 e.printStackTrace();
 *
 *                 // 如果发生异常,说明没有车票了,就中断循环,不要在卖票了
 *                 break;
 *             }
 *         }
 *     }
 */