class MyThreadWait implements Runnable {
    private final Object lock;

    public MyThreadWait(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            System.out.println("Thread starts.");

            try {
                System.out.println("Thread waits for notification.");
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread resumes after notification.");
            // Code to be executed after resuming from wait
        }
    }
}

public class WaitMethod1 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread myThread = new Thread(new MyThreadWait(lock));
        myThread.start();

        // Sleeping for 2 seconds before notifying the thread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            System.out.println("Main thread sends notification.");
            lock.notify();
        }

        System.out.println("Main thread ends.");
    }
}
