// Create a Thread in java that at first prints a welcome message, then goes to blocked state for 5 seconds and again prints a good bye message.
class WelcomeThread extends Thread 
{
    public void run() {
        System.out.println("Welcome to the Thread!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted!");
        }
        System.out.println("Goodbye from the Thread!");
    }

    public static void main(String arr[]) {
        WelcomeThread thread = new WelcomeThread();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}