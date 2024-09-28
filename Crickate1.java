// Write a java program to create a class that contains two arrays, one for stating cricketers name, another for satring their correspondinng immings score. Now write a method to get the required data from the user using setdata().
// Implement another method calculate() that will calculate and display the name of the the crickat who have scored the highest and the lowest runs in the innings.
// Generate a test class to test the above mentioned class,create object and call the funcations.

import java.util.Scanner;
public class Crickate1
{
    private String names[];
    private int score[],n;
    Crickate1(int n)
    {
        this .n=n;
        names= new String[n];
        score= new int[n];
    }

    void setdata()
    {
        System.out.println("Enter "+n+" Crickcter details one by one");
        Scanner sc1= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Cricketer:-"+(i+1)+"name");
            names[i]=sc1.nextLine();
            System.out.println("Enter score::-");
            score[i]=sc2.nextInt();
            sc1.close();
            sc2.close();
        }
    }

    void calculate()
    {
        int max=score[0],index=0;
        for(int i=0;i<n;i++)
        {
            if(score[i]>max)
            {
                max=score[i];
                index=i;
            }
        }

        System.out.println("the max scorer is:"+names[index]);
        int min=score[0];
        index=0;
        for(int i=0;i<n;i++)
        {
            if(score[i]<min)
            {
                min=score[i];
                index=i;
            }
        }
        System.out.println("the minimun scorer is:"+names[index]);
    }

    class test
    {
        public static void main(String arr[]) 
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter how many Cricketers::- ");
            int c=sc.nextInt();
            Crickate1 cr=new Crickate1(c);
            cr.setdata();
            cr.calculate();
            sc.close();
        }
    }
}
