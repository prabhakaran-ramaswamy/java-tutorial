
class MyThreadJoin extends Thread {
    public MyThreadJoin(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread " + getName() + " starts.");

        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + getName() + " ends.");
    }
}

public class ThreadJoin1 {
    public static void main(String[] args) {
    	MyThreadJoin thread1 = new MyThreadJoin("Thread 1");
    	MyThreadJoin thread2 = new MyThreadJoin("Thread 2");

        thread1.start();
        thread2.start();

        try {
            System.out.println("Main thread waits for Thread 1 to complete.");
            thread1.join();
            System.out.println("Thread 1 has completed.");

            System.out.println("Main thread waits for Thread 2 to complete.");
            thread2.join();
            System.out.println("Thread 2 has completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends.");
    }
}
