//Write  a java program to take an integer input from the user and elements its foctorial using a proper method/funcation.
import java.util.Scanner;
public class Factorial {
    public static long calculateFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
        sc.close();
    }
}

