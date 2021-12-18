package Asm_Models;

import java.util.Scanner;

public class Books {

    private String id;
    private String name;
    private String author;
    private String language;
    private String price;



    public Books(String id, String name, String author, String language, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
    }

    public Books() {
    }

    public void update (Scanner sc){

        System.out.println("Enter name ");
        this.name = sc.nextLine();

        System.out.println("Enter author ");
        this.author = sc.nextLine();

        System.out.println("Enter language ");
        this.language = sc.nextLine();

        System.out.println("Enter new price ");
        this.price = sc.nextLine();
    }

    public Books input(Scanner sc)  {

        System.out.println("Enter ID ");
        String id = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter Name ");
        String name = sc.nextLine();

        System.out.println("Enter Author ");
        String author = sc.nextLine();

        System.out.println("Enter Language ");
        String language = sc.nextLine();

        System.out.println("Enter Price ");
        String price = sc.nextLine();

        return new Books(id, name, author, language, price);
    }

    public void edit(Scanner sc) {
       System.out.println("Enter new name ");
       this.name = sc.nextLine();

       System.out.println("Enter new author ");
       this.author = sc.nextLine();

       System.out.println("Enter new language ");
       this.language = sc.nextLine();

       System.out.println("Enter new price ");
       this.price = sc.nextLine();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book ID: " + id + ". Name: " + name + "Author: " + author + ".Language: " + language + ".Price: " + price + " VND.";
    }
}