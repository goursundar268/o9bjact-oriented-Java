class HometownThread extends Thread {
    public void run() {
        try
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("hometown");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread Interrupted!");
        }
    }

    public static void main(String arr[]) {
        HometownThread thread1 = new HometownThread();
        HometownThread thread2 = new HometownThread();

        thread1.start();
        thread2.start();
    }
}