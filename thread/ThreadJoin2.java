
class MyThreadJoin2 extends Thread {
    private int delay;

    public MyThreadJoin2(String name, int delay) {
        super(name);
        this.delay = delay;
    }

    public void run() {
        System.out.println("Thread " + getName() + " starts.");

        try {
            Thread.sleep(delay); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + getName() + " ends.");
    }
}

public class ThreadJoin2 {
    public static void main(String[] args) {
    	MyThreadJoin2 thread1 = new MyThreadJoin2("Thread 1", 2000);
    	MyThreadJoin2 thread2 = new MyThreadJoin2("Thread 2", 3000);
    	MyThreadJoin2 thread3 = new MyThreadJoin2("Thread 3", 1500);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            System.out.println("Main thread waits for all threads to complete.");
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have completed.");
        System.out.println("Main thread ends.");
    }
}
