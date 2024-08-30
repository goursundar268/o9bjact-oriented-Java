//Write a java program to take the marks of 5 subjects of a student from the user in an array, calculate and print the total marks obtained and average marks design the program using object oriented principels,class,methods and objects.

import java.util.Scanner;
class Student{
    private int marks[],total,average;
    void getData(int n)
    {
        Scanner sc=new Scanner(System.in);
        marks=new int[n];
        System.out.println("Enter marks of "+n+" Subjects");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
    }
    void Calculate()
    {
        for(int i=0;i<marks.length;i++)
        total=total+marks[i];
        average=total/marks.length;
    }

    void display()
    {
        System.out.println(" The Total Marks obtained is: "+total);
        System.out.println("The average marks:"+average);
    }

    public static void main(String arr[])
    {
        Scanner sc= new Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter how many subject:-");
        int n=sc.nextInt();
        s.getData(n);
        s.Calculate();
        s.display();
    }
}