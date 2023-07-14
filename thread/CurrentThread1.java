
public class CurrentThread1 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        
        System.out.println("Current thread: " + mainThread.getName());

        // Changing the name of the main thread
        mainThread.setName("MyMainThread");
        System.out.println("Updated thread name: " + mainThread.getName());

        System.out.println("Main thread ID: " + mainThread.getId());
        System.out.println("Main thread priority: " + mainThread.getPriority());
        System.out.println("Main thread state: " + mainThread.getState());
    }
}
