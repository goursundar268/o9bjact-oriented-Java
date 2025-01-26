/*
 * Implement the following diagram:
 * Interface: Exam                 Class: Student
 * Percent_Cal()                 Name, roll_no, marks1, marks2, show()
    *              Class: Result
    *              per display()
*/
import java.util.*;
interface Exam
{
    void Percent_cal();
}
class Student 
{
    String name;
    int roll_no, marks1, marks2;
    Student (String n, int r, int m1, int m2)
    {
        this.name = n;
        this.roll_no = r;
        this.marks1 = m1;
        this.marks2 = m2;
    }
    public void show()
    {
        System.out.println("The name of Student : " + name);
        System.out.println("The Roll of Student : " + roll_no);
        System.out.println("The marks for First paper : " + marks1);
        System.out.println("The marks for Second paper : " + marks2);
    }
}
class Result extends Student implements Exam
{
    double percentage;
    Result(String n, int r, int m1, int m2)
    {
        super(n,r,m1,m2);
    }
    public void Percent_cal()
    {
        percentage = (marks1 + marks2) / 2.0;
    }
    public void Per_display()
    {
        show();
        Percent_cal();
        System.out.println("The total percentage is: " + percentage + "%");
    }
}
class Assignment_7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        System.out.println("Enter your Roll number : ");
        int r = sc.nextInt();
        System.out.println("Enter your narks for paper1 : ");
        int  m1 = sc.nextInt();
        System.out.println("Enter your narks for paper2 : ");
        int  m2 = sc.nextInt();
        Result obj = new Result(n, r, m1, m2);
        obj.Per_display();
    }
}
