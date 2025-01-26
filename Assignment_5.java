/*
 * An educational establishment keeps a database of its staff members. 
 * The hierarchical relationships between the many classes that make up the database are displayed here.
 * Create the database, write all the classes and specify the methods for retrieving specific data as needed to.
 * To test the classes, write a driver program.
 * Staff (code, name)
 * Teacher (Subject, publication) is a Staff
 * Officer (Grade) is a Staff
 * Typist (Speed) is a Staff
 * Regular Typist (Remuneration) is a Typist
 * Casual Typist (Daily wages) is a Typist
*/
import java.util.*;
class Staff
{
    int code;
    String name;
    Staff(int code, String name)
    {
        this.code = code;
        this.name = name;
    }
    public void display()
    {
        System.out.println("The employee code of the staff : " + code);
        System.out.println("Name of the staff : " + name);
    }
}
class Teacher extends Staff
{
    String subject;
    String publication;
    Teacher(int code, String name, String subject, String publication)
    {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }
    public void display()
    {
        super.display();
        System.out.println("Subject : " + subject);
        System.out.println("Publication Details : " + publication);
    }
}
class Officer extends Staff
{
    String grade;
    Officer(int code, String name, String grade)
    {
        super(code, name);
        this.grade = grade;
    }
    public void display()
    {
        super.display();
        System.out.println("Grade of the Officer is : " + grade);
    }
}
class Typist extends Staff 
{
    int speed;
    Typist(int code, String name, int speed)
    {
        super(code, name);
        this.speed = speed;
    }
    public void display()
    {
        super.display();
        System.out.println("Typing Speed in terms of words per minute : " + speed);
    }
}
class RegularTypist extends Typist
{
    double remuneration;
    RegularTypist(int code, String name, int speed, double remuneration)
    {
        super(code, name, speed);
        this.remuneration = remuneration;
    }
    public void display()
    {
        super.display();
        System.out.println("Remuneration : " + remuneration + " rs ");
    }
}
class CasualTypist extends Typist
{
    double dailyWages;
    CasualTypist(int code, String name, int speed, double dailyWages)
    {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }
    public void display()
    {
        super.display();
        System.out.println("Daily Wages : " + dailyWages + " rs ");
    }
}
class Assignment_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teacher Information : ");
        System.out.print("Enter the employee code of teacher : ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of teacher : ");
        String name = sc.nextLine();
        System.out.print("Enter the subject taught by teacher : ");
        String sub = sc.nextLine();
        System.out.print("Enter the publication details of teacher : ");
        String pub = sc.nextLine();
        Teacher teacher = new Teacher(code, name, sub, pub);
        teacher.display();
        System.out.println("--------------------------------------------");

        System.out.println("Officer Information : ");
        System.out.print("Enter the employee code of an officer : ");
        int code1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of officer : ");
        String name1 = sc.nextLine();
        System.out.print("Enter the Grade of teacher : ");
        String g = sc.nextLine();
        Officer officer = new Officer(code1, name1, g);
        officer.display();
        System.out.println("--------------------------------------------");

        System.out.print("Enter the speed of regular typist in terms of words per minute : ");
        int  speed = sc.nextInt();
        System.out.println("Regular Typist Information : ");
        System.out.print("Enter the employee code of regular typist : ");
        int code2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of regular tyoist : ");
        String name2 = sc.nextLine();
        System.out.print("Enter the remuneration amount of regular typist : ");
        double r = sc.nextDouble();
        RegularTypist regularTypist = new RegularTypist(code2, name2, speed, r);
        regularTypist.display();
        System.out.println("--------------------------------------------");

        System.out.println("Casual Typist Information : ");
        System.out.print("Enter the employee code of casual typist : ");
        int code3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of casual typist : ");
        String name3 = sc.nextLine();
        System.out.print("Enter the daily wages amount of casual typist : ");
        double w = sc.nextDouble();
        CasualTypist casualTypist = new CasualTypist(code3, name3, speed, w);
        casualTypist.display();
        System.out.println("--------------------------------------------");
    }
}