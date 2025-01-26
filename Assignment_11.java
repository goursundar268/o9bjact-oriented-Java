/************************************************************************************************
 * Write a Java program that demonstrates the use of Vector. 
 * Create a Vector of String objects, add five names to it, and then print each name using an Iterator.
************************************************************************************************/

import java.util.Iterator;
import java.util.Vector;
import java.util.Scanner;
class Assignment_11 // Main Class name : VectorDemo
{
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter five of your friend one by one add to the Vector: ");
        for(int i = 0; i < 5; i++)
        {
            str = sc.nextLine();
            names.add(str);
        }
        Iterator<String> iterator = names.iterator();
        System.out.println("\n Names of your five friends are: ");
        while (iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
