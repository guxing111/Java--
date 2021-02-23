package homework;

public class SaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread formatTicket = new InitTickedThread(ticket);
        formatTicket.start();
        try {
            formatTicket.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1 = new SaleTicketThread(ticket);
        Thread t2 = new SaleTicketThread(ticket);
        Thread t3 = new SaleTicketThread(ticket);
        Thread t4 = new SaleTicketThread(ticket);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
