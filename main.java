
import java.util.Scanner;


public class main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) { 
        library libro = new library();
        System.out.println("======Library======");
        System.out.println("1. Add book");
        System.out.println("2. Display Books");
        System.out.println("3. Borrow Book");
        System.out.print("Select: ");
        int select = sc.nextInt();
        switch (select) {
            case 1 :
                library.AddBook();
                break;
            case 2:
                libro.displayBooks();
                break;
            case 3:
                library.BorrowBook();
                break;
            case 4:
                library.ReturnBook();
                break;
            default:
                throw new AssertionError();
        }
    }
    }
    }
    