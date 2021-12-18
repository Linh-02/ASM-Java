package Control;

import Asm_Models.Books;
import Service_asm.BookService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    private List<Books> list;
    private final String pathFileToInput;
    private BookService service;

    public BookManager(String pathFileToInput) {
        this.pathFileToInput = pathFileToInput;
        this.service = new BookService();

        try {
            this.list = service.read(pathFileToInput);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void sortById(){

        Collections.sort(
            list,
            (b1, b2) -> (b1.getId().compareTo(b2.getId()))
        );
    }

    public void sortByAuthor(){

        Collections.sort(
                list,
                (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor())
        );
    }

    public void sortByLanguage(){

        Collections.sort(
            list,
            (b1, b2) -> b1.getLanguage().compareTo(b2.getLanguage())
        );
    }

    public void sortByPrice(String price){

        Collections.sort(
            list,
            (b1, b2) -> b1.getPrice().compareTo(b2.getPrice())
        );
    }

    public Books findById(int id) {

        for(Books b: list){
            if(b.getId().equals(id)){
            return b;
            }
        }
        return null;
    }

    public void addBook(Scanner sc){

        list.add(new Books().input(sc));
    }

    public void editBook(Scanner sc) {

        System.out.println("Enter ID ");
        int id = sc.nextInt();
        sc.nextLine();

        Books book = findById(id);
        book.edit(sc);
    }

    public void deleteBook(Scanner sc){

        System.out.println("Enter ID ");
        int id = sc.nextInt();
        sc.nextLine();

        Books book = findById(id);
        list.remove(book);
    }

    public void showAll(){
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }
}