
class Counter1 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread1 extends Thread {
    private Counter1 counter;

    public IncrementThread1(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization1 {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        IncrementThread1 thread1 = new IncrementThread1(counter);
        IncrementThread1 thread2 = new IncrementThread1(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
