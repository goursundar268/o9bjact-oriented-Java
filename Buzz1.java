// Write a java program to take a range from the user and print all the buzz nummber within the range.
import java.util.Scanner;
public class Buzz1
{
    public static int n;
    static void setData(int l)
    {
        n=l;
    }

    static boolean chackNum()
    {
        if((n%7==0)||(n%10==7))
        return true;
        else
        return false;
    }

public static void main(String arr[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the lower bound:-");
    int l=sc.nextInt();
    System.out.println("Enter the higher bound");
    int h=sc.nextInt();
    for(int i=l;i<=h;i++)
    {
        setData(i);
        if(chackNum())
        System.out.print(i);
        sc.close();
    }
}
}