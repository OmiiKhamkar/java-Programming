import java.util.Scanner;
class Book{
    private int id;
    private String book_name;
    private int price ;
    public Book(int id, String book_name, int price) {
        this.id = id;
        this.book_name = book_name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getBook_name() {
        return book_name;
    }
    public int getPrice() {
        return price;
    }   
}
public class Search_Book_Class {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        Book[] books = {
            new Book(101, "Java Basics", 450),
            new Book(102, "Python Programming", 550),
            new Book(103, "Data Structures", 600),
            new Book(104, "Web Development", 500),
            new Book(105, "Operating Systems", 700)
        };
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter book title to search ('exit to end'):");
            String target = sc.nextLine();
             if (target.equalsIgnoreCase("exit")) {
                 System.out.println("Program Terminated>");
                 break;
             }
             else if(books[i].getBook_name().equalsIgnoreCase(target)){
               System.out.println("Book found");
               System.out.println("ID: "+books[i].getId());
               System.out.println("Title: "+books[i].getBook_name());
               System.out.println("Price: "+books[i].getPrice());
            }
            else{
                System.out.println("Book not found");
            }
        }
  }
}

