package sw.chapter2;

public class TicketWindowRunnable implements Runnable {
    private  int index = 0;

    private String name;

    public TicketWindowRunnable(String name) {
        this.name = name;
    }

    private final static int MAX = 50;

    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread()+" 的号码是："+(index++));
        }
    }
}
