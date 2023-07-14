
class MyThreadPriority extends Thread {
    public MyThreadPriority(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + getName() + " starts.");

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + getName() + ": " + i);
        }

        System.out.println("Thread " + getName() + " ends.");
    }
}

public class ThreadPriority1 {
    public static void main(String[] args) {
        MyThreadPriority thread1 = new MyThreadPriority("Thread 1");
        MyThreadPriority thread2 = new MyThreadPriority("Thread 2");

        // Set thread priorities
        thread1.setPriority(Thread.MAX_PRIORITY); // Priority 10
        thread2.setPriority(Thread.MIN_PRIORITY); // Priority 1

        // Start the threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread ends.");
    }
}
