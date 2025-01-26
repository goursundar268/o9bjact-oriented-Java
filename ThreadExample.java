public class ThreadExample implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread:" + Thread.currentThread().getName() + "is running");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread:" + Thread.currentThread().getName() + "interupted");
        }
    }

    public static void main(String arr[])
    {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();
        Thread t1 = new Thread(thread1, "thread1");
        Thread t2 = new Thread(thread2, "thread2");
        t1.start();
        t2.start();
    }
}