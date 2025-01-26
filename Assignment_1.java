// Write a JAVA program to make the calculator which will perform Addition, Subtraction, Multiplication and Division using Switch Case.
import java.util.Scanner;
class Assignment_1 // Calculator
{
    private int a,b;
    void setData(int c, int d)
    {
        a = c;
        b = d;
    }
    void Add()
    {
        System.out.println("Addition is : " + (a+b));
    }
    void Sub()
    {
        System.out.println("Subtraction is : " + (a-b));
    }
    void Mul()
    {
        System.out.println("Multiplication is : " + (a*b));
    }
    void Div()
    {
        System.out.println("Division is : " + (a/b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment_1 c = new Assignment_1(); // Class name : Calculator
        System.out.println("Press '+' to Add");
        System.out.println("Press '-' to Subtract");
        System.out.println("Press '*' to Multiply");
        System.out.println("Press '/' to Divide");
        System.out.println("Enter your choice: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        c.setData(a, b);
        switch (c1) 
        {
            case '+':
            c.Add();
            break;
            case '-':
            c.Sub();
            break;
            case '*':
            c.Mul();
            break;
            case '/':
            c.Div();
            break;
            default: System.out.print("Wrong Choice!");
        }
    }
}