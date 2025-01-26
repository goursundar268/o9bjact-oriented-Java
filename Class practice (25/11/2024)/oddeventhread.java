class oddThread extends Thread{
    public void run(){
        try{
            for(int i=1;i<=20;i++){
                if(i%2!=0){
                    System.out.println("odd:-"+i);
                }
                Thread.sleep(500);
            }
        }
        catch (InterruptedException c){
            System.out.println("thread interrupted");
        }
    }
}
class evenThread extends Thread{
    public void run(){
        try{
            for(int i=1;i<=20;i++){
                if(i%2==0){
                    System.out.println("even:-"+i);
                }
                Thread.sleep(500);
            }
        }
        catch (InterruptedException c){
            System.out.println("thread interrupted");
        }
    }
}
 public class oddeventhread{
     public static void main(String arr[]){
         oddThread odd=new oddThread();
         evenThread even=new evenThread();
         Thread t1=new Thread(odd,"thread-1");
         Thread t2=new Thread(even,"thread-2");
         t1.start();
         t2.start();
     }
 }