

public class SleepMethod1 {
    public static void main(String[] args) {
        System.out.println("Main thread starts.");

        try {
            // Sleeping for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread resumes after sleep.");

        // Code to be executed in the main thread
        System.out.println("Main thread ends.");
    }
}
