// Create a class called grader and give it an instant variable called serve, a suitable constructer and suitable method.the letter grade is returned as E/O/A/B/C/D/F by the letter Grade() method.
// Generate a simple class now to text the Gaeder class by READING A USER PROVIDED SCORE AND USING IT TO GENERATE A PARAMETESIZED GRADER OBJECT ONCE IT HAS BEEN COFIRMED THAT THE VALUE IS BETWWEN 0 AND 100.
// TO OBTAIN AND PRINT THE LETTER GRADE() AT THE END.

// Score >=90=>0
// Score >=80=>E
// Score >=70=>A
// Score >=60=>B
// Score >=40=>C
// Score <40=>F
import java.util.Scanner;

public class Testing
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the score:");
        float s=sc.nextFloat();
        if(s>0 && s<=100)
        {
            Grader g=new Grader(s);
            char grade=g.letterGrade();
            System.out.println("The Grade is:"+grade);
        }
        else
        System.out.println("invallid Score");
        sc.close();
    }
}

class Grader
{
    private float score;
    Grader(float s)
    {
        score=s;
    }
    char letterGrade()
    {
        if(score>=90)
        return'0';
        else if(score>=80)
        return'E';
        else if(score>=70)
        return'A';
        else if(score>=60)
        return'B';
        else if(score>=40)
        return'c';
        else 
        return'F';
    }
}