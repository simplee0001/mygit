package sw.chapter2;

public class TickWindows extends Thread {

    private final int Max = 50;

    private String name;

    public TickWindows(String name) {
        this.name = name;
    }

    private static  int index = 1;
    @Override
    public void run() {
         while (index<=Max){
             System.out.println("柜台名称 "+name+"： 当前的号码是："+index++);
         }
    }
}
