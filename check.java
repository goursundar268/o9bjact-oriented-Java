// Write a java program to take one user input from the user and whether it is even or odd.
import java.util.Scanner;
public class check
{
    int option;
    double result;
    double value;
    

    void checkoption()
    {     if(option==1)
          {
          result=value*(0.62137119);
        System.out.println(value +" kilometer equel to " + result + " mile");
          }
          
          else if(option==2){
          result=value*(1.609344);
          System.out.println(value +" mile equel to " + result + " kilometer");
          }
           else
            System.out.println(option+" is not a not valid");
    }
    public static void main(String arr[])
    {
        check c=new check();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a option'{1 enter kilometer equel to mile and 2 enter mile equel to kilometer}':-");
        
        c.option=sc.nextInt();
        System.out.print("Enter a number:-");
        c.value=sc.nextDouble();
        c.checkoption();
        sc.close();
        
    }
}