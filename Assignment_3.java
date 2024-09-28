// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Assignment_3
{
    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        Library library=new Library();
        System.out.println("welcome to the Library management system");
        boolean exit=false;
        while(!exit){
            System.out.println("\n chosse an option:");
            System.out.println("1. Add a Book");
            System.out.println("2.Register a Member");
            System.out.println("3.Borrow a book");
            System.out.println("4.return a book");
            System.out.println("5.Display all books");
            System.out.println("6.Display all members");
            System.out.println("7.Exit \n");
            System.out.println("enter your choice:");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                System.out.println("enter book Title:");
                String title=scanner.nextLine();
                System.out.println("enter book author:");
                String author=scanner.nextLine();
                System.out.println("enter the book isbn:");
                String isbn=scanner.nextLine();
                library.addBook(new Book(title,author,isbn));
                break;
                case 2:
                    System.out.println("enter member name:");
                    String name=scanner.nextLine();
                    System.out.println("enter member id:");
                    String memberId=scanner.nextLine();
                    library.addMember(new Member(name,memberId));
                    break;
                case 3:
                    System.out.println("enter member Id:");
                    String memberToBorrow=scanner.nextLine();
                    System.out.println("enter book title to borrow:");
                    String bookToBorrow=scanner.nextLine();
                    library.borrowBook(memberToBorrow,bookToBorrow);
                    break;
                case 4:
                    System.out.println("enter member id:");
                    String memberToReturn=scanner.nextLine();
                    System.out.println("enter book title to return");
                    String bookToReturn=scanner.nextLine();
                    library.returnBook(memberToReturn,bookToReturn);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayMembers();
                    break;
                case 7:
                    exit=true;
                    System.out.println("exiting the library mamagemnt system:");
                    break;
                default:
                System.out.println("invalid choice.");
            }
        }
        scanner.close();
    }
}
class Book{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    public Book( String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=true;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
    }
    public void displayBookInfo()
    {
        System.out.println("Title: "+title+", Author "+author+",ISBN "+isbn+", Available"+ isAvailable);
    }
}
class Member
{
    private String name;
    private String memberId;
    private List<Book>borrowedBooks;
    public Member(String name,String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks=new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
     public String getMemberId(){
        return memberId;
    }
    public List<Book> getBorrowedbooks(){
        return borrowedBooks;
    }
    public void borrowedBook(Book book){
        borrowedBooks.add(book);
        book.setAvailable(false);
        System.out.println(name+" borrowed the book: "+book.getTitle());
        
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println(name+" returned the book: " +book.getTitle());
    }
    public void displayMemberInfo()
    {
        System.out.println("Member name: "+name+", Id:" +memberId);
        if(borrowedBooks.isEmpty())
        {
            System.out.println("no books borrowed.");
        }else{
            System.out.println("Borrowed books:");
            for(Book book:borrowedBooks)
            {
                System.out.println("- "+book.getTitle());
            }
        }
    }
    
}
class Library
{
    private List<Book>books;
    private List<Member> members;
    public Library(){
        books=new ArrayList<>();
        members=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("book added to the library: "+book.getTitle());
    }
    public void addMember(Member member)
    {
        members.add(member);
        System.out.println("Member registered: "+member.getName());
    }
    public Book searchBookByTitle(String title)
    {
        for(Book book:books)
        {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                return book;
            }
        }
        return null;
    }
    public Member searchMemberById(String memberId)
    {
        for(Member member: members)
        {
            if(member.getMemberId().equalsIgnoreCase(memberId))
            {
                return member;
            }
        }
        return null;
    }
    public void borrowBook(String memberId,String bookTitle)
    {
        Member member=searchMemberById(memberId);
        Book book=searchBookByTitle(bookTitle);
         if(member!=null && book !=null && book.isAvailable())
         {
             member.borrowedBook(book);
         }
         else if(book !=null && !book.isAvailable()){
             System.out.println("the book iscurrently not available");
         }
         else{
             System.out.println("member or book not found.");
         }
    }
    public void returnBook(String memberId,String bookTitle)
    {
        Member member=searchMemberById(memberId);
        Book book=searchBookByTitle(bookTitle);
        if(member !=null && book!=null && book.isAvailable())
        {
            member.returnBook(book);
        }
        else{
            System.out.println("member or book not found");
        }
    }
    public void displayBooks()
    {
        for(Book book: books)
        {
            book.displayBookInfo();
        }
    }
    public void displayMembers(){
        for(Member member : members)
        {
            member.displayMemberInfo();
        }
    }
}