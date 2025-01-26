//Create a thread in java that prints from 1 to 10.
public class PrintNumbers extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=10;i++)
        System.out.println(i);
    }
    public static void main (String arr[])
    {
        PrintNumbers p= new PrintNumbers();
        Thread t1= new Thread(p,"GOUR");
        t1.start();
    }
}