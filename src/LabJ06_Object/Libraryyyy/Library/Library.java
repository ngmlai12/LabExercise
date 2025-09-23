package LabJ06_Object.Libraryyyy.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    boolean found = true;
    boolean search = false;
    boolean empty = true;

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

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookTitle.equals(bookTitle)) {
                System.out.println("Removed: " + books.get(i).bookAuthor + " - " + books.get(i).bookTitle);
                System.out.println(" ");
                Book removeBook = books.remove(i);
                found = true;
                break;
            } else {
                found = false;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void searchByTitle() {
        ArrayList<Book> results = new ArrayList<>();

        if (books.isEmpty()) {
            System.out.println("No Books Found");
            return;
        }

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the book title: ");
            String bookTitle = sc.nextLine();

            for (Book book : books) {
                if (book.bookTitle.contains(bookTitle)) {
                    results.add(book);
                }
            }

            if (!results.isEmpty()) {
                empty = false;
                search = true;

                for (Book result : results) {
                    System.out.println(result.bookAuthor + " - " + result.bookTitle);
                }

            } else {
                empty = true;
                search = false;
                System.out.println("Not found, Try again");
            }
        } while (!search);
    }
}
