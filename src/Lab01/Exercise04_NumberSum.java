package Lab01;

import java.util.Scanner;

public class Exercise04_NumberSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter an integer: ");
        int number = scanner.nextInt();

        int num1 = number % 1000 % 100 % 10;
        int num2 = (number % 1000 % 100 - num1) / 10;
        int num3 = (number % 1000 - num2 - num1) / 100;
        int num4 = (number - num3 - num2 - num1) / 1000;

        System.out.println(num1 + num2 + num3 + num4);
    }
}
