
class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }
}

public class CreateThread1 {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThread myThread = new MyThread();
        
        // Starting the thread
        myThread.start();
        
        // Code to be executed in the main thread
        System.out.println("Main thread is running");
    }
}

