/*
 * Write a program to illustrate creation of threads using runnable interface. 
 * (start method start of each of the newly created thread. Inside the run method there is sleep() 
 * for suspend the thread for 5 seconds.)
*/
public class Assignment_9 implements Runnable // Real class name - Main
{
    public void run() {
        try {
            for(int i=0; i<5; i++)
            {
                System.out.println("Thread:" +Thread.currentThread().getName()+" is running");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread:" + Thread.currentThread().getName()+ " interupted." );
        }
    }
    public static void main(String arr[])
    {
        Assignment_9 thread1 = new Assignment_9();
        Assignment_9 thread2 = new Assignment_9();
        Thread t1 = new Thread (thread1, "thread-1");
        Thread t2 = new Thread (thread2, "Thread-2");
        t1.start();
        t2.start();
    }
}
