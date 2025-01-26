// Assignment 10
/* 
Define an exception called “NoMatchFoundException” that is 
thrown when a string is not equal to “University”. Write a 
program that uses this exception. 
*/
import java.util.Scanner;
public class Assignment_10 // Actual Class name : StringCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        try 
        {
            if (str.equals("University")) 
            {
                System.out.println("University.");
            }
            else
            {
                throw new NoMatchFoundException("Enter proper String: ");
            }
        } 
        catch (NoMatchFoundException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
class NoMatchFoundException extends Exception
{
    public NoMatchFoundException(String msg)
    {
        super(msg);
    }
}