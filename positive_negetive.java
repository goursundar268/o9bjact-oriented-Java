// Write a java program to take one user input from the user and chack whether the number is positive or negative.
import java.util.Scanner;
class check
{
    int a;
    void checkpositive()
    {
        if(a>0)
        System.out.println(a+"is positive");
        else if(a==0)
         System.out.println(a+"is undefine");
        else
        System.out.println(a+"is negative");
    }
    public static void main(String arr[])
    {
        check c=new check();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value:-");
        c.a=sc.nextInt();
        c.checkpositive();
    }
}