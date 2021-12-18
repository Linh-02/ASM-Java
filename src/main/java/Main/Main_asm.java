package Main;

import Asm_Models.Books;
import Control.BookManager;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import Service_asm.BookService;

public class Main_asm {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BookService service = new BookService();
        List<Books> Book = service.read("./resources/books-input.txt");

        String choose  = null;
        boolean exit = false;

        BookManager mng = new BookManager("./resources/books-input.txt");

        showMenu();

        while(true){
            choose = scanner.nextLine();

            switch(choose){
                case "1":
                    System.out.println("Insert a book ");
                    mng.addBook(scanner);
                    break;

                case "2":
                    System.out.println("Update a book ");
                    mng.editBook(scanner);
                    break;

                case "3":
                    System.out.println("Delete a book ");
                    mng.deleteBook(scanner);
                    break;

                case "4":
                    System.out.println("Filter by author ");
                    mng.sortByAuthor();
                    break;

                case "5":
                    System.out.println("Filter by language ");
                    mng.sortByLanguage();
                    break;

                case "6":
                    System.out.println("Filter by price");
                    mng.sortByPrice(choose);
                    break;

                case "7":
                    System.out.println("Sort by ID");
                    mng.sortById();
                    break;

                case "8":
                    System.out.println("Show all");
                    mng.showAll();
                    break;

                case "0":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
                if(exit){
                    break;
            }
            showMenu();
        }
    }

    public static void showMenu(){
        System.out.println("---------------Choose---------------");
        System.out.println("|   1. Insert a new book             |");
        System.out.println("|   2. Update a book                 |");
        System.out.println("|   3. Delete a book                 |");
        System.out.println("|   4. Filter by author              |");
        System.out.println("|   5. Filter by language            |");
        System.out.println("|   6. Filter by price               |");
        System.out.println("|   7. Sort by ID                    |");
        System.out.println("|   8. Show all book                 |");
        System.out.println("|   0. Exit                          |");
        System.out.println("------------------------------------");
        System.out.println("    Please choose number ");
    }
}