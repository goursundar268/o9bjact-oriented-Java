// Write a JAVA program to take an integer input N from the user and 
// print the first N numbers from the Fibonacci series using a method PrintFibo().
import java.util.Scanner;
class  Assignment_2_2 //Fibonacci
{
    private int n, m1, m2, m3;
    void setData(int l)
    {
        n = l;
    }
    Assignment_2_2() // Fibonacci
    {
        m1 = 0;
        m2 = 1;
    }
    void PrintFibo()
    {
        System.out.println("The First " + n + " Fibonacci Numbers are:");
        System.out.println(m1);
        System.out.println(m2);
        int i = 1;
        while (i <= (n - 2))
        {
            m3 = m1 + m2;
            System.out.println(m3);
            m1 = m2;
            m2 = m3;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_2_2 obj = new Assignment_2_2();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        obj.setData(n);
        obj.PrintFibo();
    }
}
