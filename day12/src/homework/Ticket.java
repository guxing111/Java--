package homework;

public class Ticket {
    private String[] tickets = new String[200];

    private int index = tickets.length - 1;

    public Ticket() {
    }

    /**
     * public void initTicket() {
     *         // 初始化车票,给数组的元素赋值,考虑是否要同步
     *         for (int i = 0; i < tickets.length; i++) {
     *             tickets[i] = "第" + (i + 1) + "号车票";
     *         }
     *     }
     */
    public void initTicket(){
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = "第" + (i + 1) +"号车票.";
        }
    }
    public synchronized String saleTicket() throws NoTicketException {
        if (index >= 0){
            String string = tickets[index];
            /*for (int i = 0; i < tickets.length; i++) {
                tickets[i] = "第" + (i + 1) +"号车票.";
            }*/
            tickets[index] = null;
            index--;
            return string;
        }else {
            throw new NoTicketException("车票已售罄！");
        }
    }
   /* public synchronized String saleTicket() throws NoTicketException {
        // 判断是否有票,有票的情况下再卖票,没有票呢,抛出异常,
        // 考虑是否需要同步

        if (index >= 0) {
            String s = tickets[index];
            tickets[index] = null;
            index--;
            return s;
        } else {
            throw new NoTicketException("没有车票了");
        }

    }*/
}

