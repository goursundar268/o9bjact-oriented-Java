//Write a java program to take an integer input from the user and print the total number of digit in that number.Also Calculate the sum of all its digits.
import java.util.Scanner;

public class Main {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
            count++;
        }

        System.out.println("Total number of digits: " + count);
        System.out.println("Sum of all digits: " + sum);
        sc.close();
    }
}