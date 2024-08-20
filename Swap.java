// Write a java program to take two ingteger input from the user and swap their values.

import java.util.Scanner;
public class Swap
{
    int a;
    void Swapping(Swap s)
    {
        int c=this.a;
        this.a=s.a;
        s.a=c;
    }



    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the First value:-");
        Swap s1=new Swap();
        s1.a=sc.nextInt();
        System.out.println("Enter the second value:-");
        Swap s2=new Swap(); 
        s2.a=sc.nextInt();
        System.out.println("Value after swaping:");
        System.out.println("First value:"+s1.a);
        System.out.println("seconf value:"+s2.a);
        sc.close();
    
    }     
        
}
