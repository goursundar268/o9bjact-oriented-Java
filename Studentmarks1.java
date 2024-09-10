
// Write a java program to create a class studentmarks,that contains two arrays, one containing the name of five students, and another array to store their corresponding marks.
// it also have a method named searchstud() that takes the name of a student as parameter and search for that student in the array that stores the name.if the name found, return his/her corresponding marks from the marks array.
// Generate a simple class to test the studentmarks class where you take the inputs from the user and create object of studentsmarks class to access methods.

// Write a java program to create a class studentmarks,that contains two arrays, one containing the name of five students, and another array to store their corresponding marks.
// it also have a method named searchstud() that takes the name of a student as parameter and search for that student in the array that stores the name.if the name found, return his/her corresponding marks from the marks array.
// Generate a simple class to test the studentmarks class where you take the inputs from the user and create object of studentsmarks class to access methods.
import java.util.Scanner;
class Studentmarks1{
    public static void main(String arr[]) {
        String n[] = new String[5];
        int m[] = new int[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter name and marks of 5 Students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of Students:-" + (i + 1) + ":");
            m[i] = sc2.nextInt();
        }

        Studentmarks sm = new Studentmarks(n, m);
        System.out.print("Enter name to Search:");
        String s = sc1.nextLine();
        int marks = sm.Searchstud(s);
        if (marks != -1)
            System.out.println("Marks Obtained by" + s + "is:" + marks);
        else
            System.out.println("Student Name Not Found!");
        sc1.close();
        sc2.close();
    }
}

class Studentmarks {
    private String names[];
    private int marks[];

    Studentmarks(String n[], int m[]) {
        names = n;
        marks = m;
    }

   int Searchstud(String s) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(s)) {
                return marks[i];
            }
        }
        return -1;
    }
}