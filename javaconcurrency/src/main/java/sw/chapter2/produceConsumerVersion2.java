package sw.chapter2;

import java.util.stream.Stream;

public class produceConsumerVersion2 {
    private int i = 0;
    final private Object LOCK = new Object();

    private volatile boolean isProcuce = false;


    public void produce() {
        synchronized (LOCK) {
            if (isProcuce) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                i++;
                System.out.println("p>> " + i);
                LOCK.notify();
                isProcuce = true;
                //todo
            }
        }
    }

    public void consume() {
        synchronized (LOCK) {
            if (isProcuce) {
                System.out.println("c>>>" + i);
                LOCK.notify();
                isProcuce = false;
            } else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        produceConsumerVersion2 pc = new produceConsumerVersion2();
        Stream.of("p1", "p2").forEach(n ->


                new Thread() {
                    @Override
                    public void run() {
                        while (true) {
                            pc.produce();
                        }
                    }
                }.start()


        );


        Stream.of("c1", "c2").forEach(n ->

                new Thread() {
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
