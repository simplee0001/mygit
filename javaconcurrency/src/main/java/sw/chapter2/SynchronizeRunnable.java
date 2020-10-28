package sw.chapter2;

public class SynchronizeRunnable implements Runnable{
    private int index = 0;
    private final static int Max = 500;


    private synchronized boolean ticket(){
        if(index>Max)
            return true;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()+"  的号码是"+(index++));
        return false;
    }

    @Override
    public void run() {
        while (true){
            if (ticket())
                break;
        }
    }
}
