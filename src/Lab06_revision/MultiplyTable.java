package Lab06_revision;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int[] array1 = new int[sc.nextInt()];

        System.out.printf("%2s %1s", "*", "|");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.printf("%4d", array1[i]);
        }
        System.out.println(" ");

        for (int i = 0; i <= array1.length; i++) {
            System.out.printf("%4s", "----");
        }
        System.out.println(" ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.printf("%2d %1s", array1[i], "|");
            for (int j = 0; j < array1.length; j++) {
                array1[j] = j + 1;
                System.out.printf("%4d", array1[i] * array1[j]);
            }
            System.out.println(" ");h

    }
}
