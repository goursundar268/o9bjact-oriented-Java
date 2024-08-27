//Write a java proggram to take an integer input N from user and print the first N number from the fibonacci series using print firbonacci method.
import java.util.Scanner;

class Fibonaccii {
    private int n, m1, m2, m3;

    void setData(int n) {
        this.n = n;
    }

    Fibonaccii() {
        m1 = 0;
        m2 = 1;
    }

    void printFibo() {
        System.out.println("The first" + " fibonacci Number are:");
        System.out.println(m1);
        System.out.println(m2);

        int i = 1;
        while (i <= (n - 1)) {
            m3 = m1 + m2;
            System.out.println(m3);
            m1 = m2;
            m2 = m3;
            i++;
        }
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        Fibonaccii f = new Fibonaccii();
        System.out.print("Enter the how many values to print:-");
        int n = sc.nextInt();
        f.setData(n);
        f.printFibo();
        sc.close();

    }

}
