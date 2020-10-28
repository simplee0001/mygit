package sw.chapter2.chapter3;

import java.util.stream.Stream;

public class produceConsumerVersion3 {
    private int i = 0;
    final private Object LOCK = new Object();

    private volatile boolean isProcuce = false;


    public void produce() {

        synchronized (LOCK) {
            while (isProcuce){
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            i++;
            System.out.println("p>> " + i);
            LOCK.notifyAll();
            isProcuce = true;
            //todo

        }
    }

    public void consume() {
        synchronized (LOCK) {

            while (!isProcuce){
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

                System.out.println("c>>>" + i);
                LOCK.notifyAll();
                isProcuce = false;

        }
    }

    public static void main(String[] args) {
        produceConsumerVersion3 pc = new produceConsumerVersion3();
        Stream.of("p1", "p2","p3","p4").forEach(n ->
                new Thread(n) {
                    @Override
                    public void run() {
                        while (true) {
                            pc.produce();
                        }
                    }
                }.start()


        );


        Stream.of("c1", "c2","c3","c4").forEach(n ->

                new Thread(n) {
                    @Override
                    public void run() {
                        while (true) {
                            pc.consume();
                        }
                    }
                }.start()

        );



    }

}
