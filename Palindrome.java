// write a java program to take a range from the user and print all the palidrone numbers within that range the program should be designed folllowing the object oriented principle.
import java.util.Scanner;
public class Palindrome {
    private int m,n;
    void setData(int n)
    {
        this.n=m;
    }
    boolean palidrone()
    {
        m=n;
        int d,r=0;
        while(n!=0)
        {
            d=n%10;
            r=(r*10)+d;
            n=n/10;
        }

        if(r==m)
        return true;
        else
        return false;
    
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        Palindrome pp=new Palindrome();
        System.out.println("Enter lower limit:-");
        int l=sc.nextInt();
        System.out.println("Enter a upper limit");
        int u=sc.nextInt();
        System.out.println("The Palindrome numbers are::-");
        for(int i=l;i<=u;i++)
        {
            pp.setData(i);
            if(pp.palidrone());
            System.out.println(i);
            sc.close();
        }

    }
    
}
