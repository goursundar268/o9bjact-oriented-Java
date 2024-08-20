import java.util.Scanner;
class Percentage
{
    private int maeks;
    void setData(int m)
    {
        marks=m;
    }
    void Grade()
    {
        if (marks>=90)
        System.out.println("Grade A");
        else if(marks>=80)
        System.out.println("Grade B");
        else if(marks>=70)
        System.out.println("Grade C");
        else if(marks>=60)
        System.out.println("Grade D");
        else if(marks>=40)
        System.out.println("Grade E");
        else
        System.out.println("Grade F");
    }
    public void main(String arr[])
    {
        Scanner sc=new Scanner(System in);
        Percentage p=new Percentage();
        System.out.print("Enter a marks");
        int m=sc.nextInt();
        p.setData(m);
        p.Grade();
    }
}