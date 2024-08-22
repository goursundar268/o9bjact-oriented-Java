// Write a java to implement the basic oprations of a calculater using switch case.
// Display prpper manu the user should be able to input two value and the operator tooperate on the values.

import java.util.Scanner;
public class calculater
{
    private int a,b;
    void setData(int c,int d)
    {
        a=c;
        b=d;
    }
    void Add()
    {
         System.out.println("\n The Addition is:-"+(a+b));
    }
    void Sub()
    {
        System.out.println("\n The Subtraction is:-"+(a-b));
        
    }
    void Mul()
    {
        System.out.println("\n The Multiplication is:-"+(a*b));
    }
    void Div()
    {
        System.out.println("\n The Divison is:-"+(a/b));
    }

    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        calculater c=new calculater();
        System.out.println("MANU");
        System.out.println("_______________________");
        System.out.println("Press + For Addition");
        System.out.println("Press - For Subtraction");
        System.out.println("Press * For Multiplication");
        System.out.println("Press / For Divison");
        
        System.out.print("Enter your choice:-");
        char c1=sc.next().charAt(0);
        System.out.print("Enter the first value:-");
        int a=sc.nextInt();
        System.out.print("Enter the second value:-");
        int b=sc.nextInt();
        c.setData(a,b);
        switch(c1)
        {
            case'+':c.Add();
            break;
            case'-':c.Sub();
            break;
            case'*':c.Mul();
            break;
            case'/':c.Div();
            break;
            default: System.out.println("You are wrong choice!!");
            sc.close();
        
        }
    }
}