package sw.chapter2;

public class Bank2 {
    public static void main(String[] args) {
        String name ="";
        final TicketWindowRunnable ticketWindowRunnable = new TicketWindowRunnable(name);
        Thread ticketWindowRunnable1 = new Thread(ticketWindowRunnable,"一号窗口");
        Thread ticketWindowRunnable2 = new Thread(ticketWindowRunnable,"二号窗口");
        Thread ticketWindowRunnable3 = new Thread(ticketWindowRunnable,"三号窗口");
        ticketWindowRunnable1.start();
        ticketWindowRunnable2.start();
        ticketWindowRunnable3.start();
    }

}
