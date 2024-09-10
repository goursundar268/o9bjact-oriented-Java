//Write a java program to compute the value of Euler's number that is used on the base use the  formula.
//  c=1+ 1/1! + 1/2! + 1/3! ------ 1/n!
// Where the value of n is provided by the user at rutine and the factorial must be evaluted by a separate recussive fact() method.

import java.util.Scanner;
public class Euler {
    private int n;
    Euler(int n)
    {
        this.n=n;
    }
    void Calculate()
    {
        double e=0.0;
        for (int i=0;i<n;i++)
        {
            e=e+1.0/fact(i);
        }

        System.out.println("Euler's Number is:"+e);
    }

    int fact (int n)
    {
        if(n==0)
        return 1;
        else
        return(n*fact(n-1));
    }

    public void main (String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many terms:");
        int t=sc.nextInt();
        Euler eu=new Euler(t);
        eu.Calculate();
        sc.close();
    }


    
}
