/* Write a java program to create an integer array through its parameterised constructor, those will be a Display() method that display only the prime values within that array.
 * to chack for prime, we a pre to chack for prime check() method that acceptts an intger oo argument returns true if the no. is prime,false otherwise,now generate another test class to test the peime class by accept ing user i/p,passing them through constuctor all methods.
  */

import java.util.Scanner;

public class prime1 {
  private int arr[];

  prime1(int a[]) {
    arr = a;
  }

  void display() {
    for (int i = 0; i < arr.length; i++) {
      if (primeChack(arr[i]))
      {
        System.out.println(arr[i]);
      }
    }
  }

  boolean primeChack(int a) {
    boolean flag = true;
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        flag = false;
        break;
      }
    }
    return flag;
  }
}

class Test
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter"+n+" element:");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    prime1 p=new prime1(arr);
    p.display();
    sc.close();
  }

  
}