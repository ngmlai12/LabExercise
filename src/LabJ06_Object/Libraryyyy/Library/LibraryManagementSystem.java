package LabJ06_Object.Libraryyyy.Library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] choice = {"add a book", "Remove a book", "Search by Title" };
        Library library = new Library();
        int choiceNum;
        do {
            System.out.println("=== Library Management System ===");
            for (int i = 0; i < choice.length; i++) {
                System.out.println(i + 1 + ". " + choice[i]);
            }
            System.out.println(" ");
            System.out.print("Input a selection: ");
            choiceNum = sc.nextInt();

            if (choiceNum >= 1 && choiceNum <= choice.length) {
                System.out.println("Dummy: " + choice[choiceNum - 1]+"\n");
                switch (choiceNum) {
                    case 1:
                        library.AddBook();
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                }

            } else {

                System.out.println("Bye~");
                break;
            }
        } while (true);
    }
}
