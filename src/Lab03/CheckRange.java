package Lab03;

import java.util.Scanner;

public class CheckRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Please enter the number:");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Try again");
            }
        } while (num < 0 || num > 100);
        System.out.println("Correct!!!");
    }
}
