
class MyThreadYield1 extends Thread {
    public MyThreadYield1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            Thread.yield();
        }
    }
}

public class ThreadYield1 {
    public static void main(String[] args) {
    	MyThreadYield1 thread1 = new MyThreadYield1("Thread 1");
    	MyThreadYield1 thread2 = new MyThreadYield1("Thread 2");
        thread1.start();
        thread2.start();
    }
}
