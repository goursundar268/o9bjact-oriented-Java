/************************************************************************************************
 * Write a Java program that uses a HashSet to store unique Book objects. 
 * Implement the Book class with fields for title and author.
 * Ensure that Book Objects are considered equal based on title and author.
 * Add several Book objects to the HashSet, including duplicates, and print the unique books in the set.
 ************************************************************************************************/

import java.util.HashMap;
import java.util.Map;
class Book
{
    private String title;
    private String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
public class Assignment_12 // Class : Main
{
    public static void main(String[] args) 
    {
        Map<String, Book> books = new HashMap<>();
        books.put("The Lord of the Rings by J.R.R.Tolkein", new Book("The Lord of the Rings", "J.R.R.Tolkein"));
        books.put("Pride and Prejudice by Jane Austine", new Book("Pride and Prejudice", "Jane Austine"));
        books.put("To kill MockingBird by Harper Lee", new Book("To kill MockingBird", "Harper Lee"));
        books.put("The Lord of the Rings by J.R.R.Tolkein", new Book("The Lord of the Rings", "J.R.R.Tolkein"));
        books.put("Pride and Prejudice by Jane Austine", new Book("Pride and Prejudice", "Jane Austine"));
        for(Book book : books.values())
        {
            book.display();
        }
    }
}