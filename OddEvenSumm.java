
// Write a java program that goes on taking user intger input until 0(Zero) is entered. After that calculate the sum of all the even value and sum of an odd valuse entered so far.
import java.util.Scanner;

public class OddEvenSumm {
    private int n, evensum, oddsum;

    void setData(int n) {
        this.n = n;
    }

    OddEvenSumm() {
        evensum = 0;
        oddsum = 1;
    }

    void calculate() {
        if (n % 2 == 0)
            evensum += n;
        else
            oddsum += n;
    }

    void Display() {
        System.out.println("Evensum:" + evensum);
        System.out.println("Oddsum:" + oddsum);
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        OddEvenSumm o = new OddEvenSumm();
        int k;
        System.out.println("Enter value one by one:-");

        do {
            k = sc.nextInt();
            o.setData(k);
            o.calculate();
        } while (k != 0);
        o.Display();
        sc.close();
    }
}
