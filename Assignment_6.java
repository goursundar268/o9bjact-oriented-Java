/*
 * Develop a personnel management system that supports overriding and overloading of methods.
 * Create an Employee class and include methods for figuring out the pay.
 * For various employee kinds, create subclass and override the salary computation mechanism.
*/
import java.util.*;
class Employee 
{
    private String name;
    private int employeeId;

    // Parameterized constructor
    Employee(String name, int employeeId) 
    {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Overridden method
    double calculateSalary() 
    {
        return 0.0;
    }

    // Method overloading
    double calculateSalary(double bonus) 
    {
        return calculateSalary() + bonus;
    }

    // Display employee details
    void display() 
    {
        System.out.println("Employee ID: " + employeeId + "\n" + "Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee 
{
    private double monthlySalary;

    // Constructor to initialize full-time employee details
    FullTimeEmployee(String name, int employeeId, double monthlySalary) 
    {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    // Overriding method
    double calculateSalary() 
    {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee 
{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) 
    {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Overriding method
    double calculateSalary() 
    {
        return hourlyRate * hoursWorked;
    }
}

public class Assignment_6 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        
        // Full-Time Employee details input
        System.out.println("Enter the name of Full Time Employee: ");
        String ftm = obj.nextLine();
        System.out.println("Enter the Id of Full Time Employee: ");
        int fti = obj.nextInt();
        System.out.println("Enter the base salary of Full Time Employee: ");
        double ds = obj.nextDouble();
        System.out.println("Enter the bonus for Full Time Employee: ");
        double bs = obj.nextDouble();
        
        FullTimeEmployee fullTime = new FullTimeEmployee(ftm, fti, ds);
        fullTime.display();
        System.out.println("Full-Time Employee Salary: " + fullTime.calculateSalary());
        System.out.println("Full-Time Employee Salary with Bonus: " + fullTime.calculateSalary(bs));
        System.out.println("--------------------------------------------");

        // Part-Time Employee details input
        obj.nextLine(); // Consume the leftover newline character
        System.out.println("Enter the name of Part Time Employee: ");
        String ptm = obj.nextLine();
        System.out.println("Enter the Id of Part Time Employee: ");
        int pti = obj.nextInt();
        System.out.println("Enter the salary per working hour of Part Time Employee: ");
        double hr = obj.nextDouble();
        System.out.println("Enter the time of working in hours for Part Time Employee: ");
        int hw = obj.nextInt();
        System.out.println("Enter the bonus for Part Time Employee: ");
        double pbs = obj.nextDouble();

        PartTimeEmployee partTime = new PartTimeEmployee(ptm, pti, hr, hw);
        partTime.display();
        System.out.println("Part-Time Employee Salary: " + partTime.calculateSalary());
        System.out.println("Part-Time Employee Salary with Bonus: " + partTime.calculateSalary(pbs));

        System.out.println("--------------------------------------------");
    }
}