/*
 Write a Java program that calculate the sum of all the Prime numbers within a specified range 
 and determine the total number of Prime number sin that range.
 The program should be designed using object-oriented principles, utilizing classes constructors 
 and methods to handle the different component of the task such as range validation, prime number checking and final calculation.
*/

import java.util.Scanner;
class Assignment_2_1 // Prime
{    
    private int sum, count, n;
    void setData(int m)
    {
        n = m;
    }
    Assignment_2_1() // Prime
    {
        sum = 0;
        count = 0;
    }
    boolean PrimeCheck()
    {
        boolean isPrime = true;
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    void AddPrime(int l, int u)
    {
        for(int i = l; i <= u; i++)
        {
            if(i < 2)
                continue;
            else
            {
                this.setData(i);
                if(this.PrimeCheck())
                {
                    sum += i;
                    count++;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Sum of all Prime Numbers: " + this.sum);
        System.out.println("No. of Prime Numbers: " + this.count);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Assignment_2_1 p = new Assignment_2_1();
        System.out.print("Enter Lower Bound: ");
        int k = sc.nextInt();
        System.out.print("Enter Upper Bound: ");
        int l = sc.nextInt();
        p.AddPrime(k, l);
        p.display();
        sc.close();
    }
}