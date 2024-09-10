
/*Create a class an Array addition that contains a single integer array use parameterised constructer to assign.
 The value to the array there is a method named add(),that accepts two array addition class type variable,add the repetative array elements index wise and store in another array attached to the involing object.
 there will be another method display() to display the final array elements now,create a test class that will accpts array element for the user and call the methods to full file the requirment.*/
 import java.util.Scanner;

 public class MainArrayAddition {
     public static void main(String arr[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the arrays: ");
         int n = sc.nextInt();
 
         int a[] = new int[n];
         int b[] = new int[n];
 
         System.out.println("Enter " + n + " elements into first array:");
         for (int i = 0; i < n; i++)
             a[i] = sc.nextInt();
 
         System.out.println("Enter " + n + " elements into second array:");
         for (int i = 0; i < n; i++)
             b[i] = sc.nextInt();
 
         ArrayAddition a1 = new ArrayAddition(a);
         ArrayAddition a2 = new ArrayAddition(b);
 
         ArrayAddition a3 = new ArrayAddition(n);
 
         a3.Add(a1, a2);
         a3.display();
         sc.close();
 
     }
 }
 
 
 class ArrayAddition {
     private int arr[];
     private int n;
 
     ArrayAddition(int n) {
         this.n = n;
         arr = new int[n];
     }
 
     ArrayAddition(int a[]) {
         arr = a;
     }
 
     void Add(ArrayAddition a1, ArrayAddition a2) {
         for (int i = 0; i < n; i++) {
             this.arr[i] = a1.arr[i] = a2.arr[i];
         }
     }
 
     void display() {
         System.out.println("The Addition of the two given array elemnts is::");
         for (int i = 0; i < n; i++)
             System.out.println(arr[i] + " ");
     }
 }
 
 