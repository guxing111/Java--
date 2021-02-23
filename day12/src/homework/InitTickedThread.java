package homework;

/**
 * class InitTicketThread extends Thread {
 *     private Ticket ticket;
 *     public InitTicketThread(String name, Ticket ticket) {
 *         super(name);
 *         this.ticket = ticket;
 *         this.start();
 *     }
 *
 *     // 在run方法中初始化车票
 *     public void run() {
 *         ticket.initTicket();
 *     }
 * }
 */
public class InitTickedThread extends Thread {
    private Ticket ticket;

    public InitTickedThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.initTicket();
    }
}
