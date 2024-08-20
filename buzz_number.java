// Write java program to take an integer input from the user and chack whether it is a BUZZ number
// or not using a static method with boolean return type.
// NOTE:- A Buzz number is a  number that is either divisible by 7 or the last digit is 7.

import java.util.Scanner;
class Buzz
{
    public static int n;
    static void setData(int i)
    {
        n=i;
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
        System.out.print("Enter a number:-");
        int R=sc.nextInt();
        setData(R);
        if(chackNum())
        {
            System.out.println(R+"is a BUZZ NO.");
        }
        else
        {
            System.out.println(R+"is not a BUZZ NO.");
        }
    }
}