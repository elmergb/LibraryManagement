import java.util.ArrayList;
import java.util.Scanner;

public class library {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void AddBook(){
        System.out.println("=====Add book======= ");
        System.out.print("Title: ");
        String title = sc.nextLine();
        
        System.out.print("author: ");
        String author = sc.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added");
        
    }
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("No Book");
         
        } else {
            for (Book libro : books) {
                libro.displayInfo();
            }
            
        }
    }
    public static void BorrowBook(){
        System.out.print("What title of the you borrow? ");
        String title = sc.nextLine();
        System.out.print("Who is the author? ");
        String author = sc.nextLine();

        boolean isFound = false;
            for (Book libro : books) {
                if (libro.title.equals(title) && libro.author.equals(author)){
                libro.borrowBook();
                System.out.println("borrowed");

            } else  {
                System.out.println("Sorry, this book is already borrowed");
            }
            isFound = true;
            break;
        }
        if (!isFound){
             System.out.println("We dont have like that book");
        }
    }

    public static void ReturnBook(){
        System.out.print("what book you return? ");
        String title = sc.nextLine();
        System.out.println("who's the author? ");
        String author = sc.nextLine();

        Boolean isFound = false;
        for (Book libro : books) {
            if (libro.title.equals(title) && libro.author.equals(author)) {
                libro.returnBook();
                System.out.println("Return successfully");
            }
            isFound = true;
            break;
        }
        if (!isFound){
            System.out.println("Did not return");
        }
    }
}
