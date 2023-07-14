class Counter2 {
    private int count = 0;
    private Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}

class IncrementThread2 extends Thread {
    private Counter2 counter;

    public IncrementThread2(Counter2 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization2 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();

        IncrementThread2 thread1 = new IncrementThread2(counter);
        IncrementThread2 thread2 = new IncrementThread2(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
