// write a java program to take an integer array from the user and physically reverse it and display without using any second array.
// input:- |7|9|2|8|
// output:-|8|2|9|7|

import java.util.Scanner;

class Done
    {
        public static void main (String arr[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter how many elements::-");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter "+n+" array elements:");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            ArrayRev r=new ArrayRev(a);
            r.reverse();
            r.display();
            sc.close();
        }
    }

class ArrayRev 
{
    private int arr[],temp;
    ArrayRev(int a[])
    {
        arr=a;
    }

    void reverse()
    {
        int i=0;
        int j=(arr.length-1);
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    void display()
    {
        System.out.println("Array elements after Reverse::-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
