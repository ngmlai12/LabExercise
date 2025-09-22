package LabJ06_Object.Libraryyyy.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
ArrayList<Book> books =  new ArrayList<>();

    public void AddBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the book title: ");
        String bookTitle = sc.nextLine();
        System.out.print("Input the book author: ");
        String bookAuthor = sc.nextLine();
        System.out.println("Done!!!");
        System.out.println(" ");
        Book newBook = new Book(bookTitle, bookAuthor);
        books.add(newBook);
    }

    public void RemoveBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a full book title:");
        String bookTitle = sc.nextLine();
    }
}
