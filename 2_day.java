// Write a java program to take two ingteger input from the user and swap their values.

import java.util.Scanner;
class swap
{
    int a;
    void swapping(swap s)
    {
        int c=this.a;
        this.a=s.a;
        s.a=c;
    }



    public static void main(String arr[])
    {
        Scanner se=new Scanner(System.in);
        
        System.out.println("Enter the First value:-");
        swap s1=new swap();
        s1.a=se.nextInt();
        System.out.println("Enter the second value:-");
            swap s2=new swap(); 
           s2.a=se.nextInt();
           System.out.println("Value after swaping:");
           System.out.println("First value:"+s1.a);
           System.out.println("seconf value:"+s2.a);
    }     
        
}