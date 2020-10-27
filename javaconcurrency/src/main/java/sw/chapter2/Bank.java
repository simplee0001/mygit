package sw.chapter2;

public class Bank {
    public static void main(String[] args) {
        TickWindows tickWindows1 = new TickWindows("一号柜台");
        tickWindows1.start();

        TickWindows tickWindows2 = new TickWindows("二号柜台");
        tickWindows2.start();
        TickWindows tickWindows3 = new TickWindows("三号柜台");
        tickWindows3.start();
    }
}
