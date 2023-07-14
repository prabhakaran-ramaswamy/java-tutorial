
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }
}

public class CreateThread2 {
    public static void main(String[] args) {
        // Creating an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Creating a Thread and passing the MyRunnable instance to it
        Thread myThread = new Thread(myRunnable);

        // Starting the thread
        myThread.start();

        // Code to be executed in the main thread
        System.out.println("Main thread is running");
    }
}
