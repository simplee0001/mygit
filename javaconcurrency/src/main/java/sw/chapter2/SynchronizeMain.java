package sw.chapter2;

public class SynchronizeMain {
    public static void main(String[] args) {

     SynchronizeRunnable ticketWindowRunnable = new SynchronizeRunnable();
        Thread ticketWindowRunnable1 = new Thread(ticketWindowRunnable,"1号窗口");
        Thread ticketWindowRunnable2 = new Thread(ticketWindowRunnable,"2号窗口");
        Thread ticketWindowRunnable3 = new Thread(ticketWindowRunnable,"3号窗口");
        ticketWindowRunnable1.start();
        ticketWindowRunnable2.start();
        ticketWindowRunnable3.start();
        System.out.println("结束");
    }
}
