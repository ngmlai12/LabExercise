package Lab05_array;

import java.util.Scanner;

public class DuplicateSearcher {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++" };
        String[] array2 = {"SQLite", "Oracle", "C++", "DB2", "JAVA" };

        System.out.print("Array 1: [");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Array 2: [");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println(" ");

        duplicates(array1, array2);
    }

    public static void duplicates(String[] array1, String[] array2) {
        System.out.println("Common element(s)");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }

}
