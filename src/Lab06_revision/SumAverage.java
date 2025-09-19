package Lab06_revision;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter small number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter big number: ");
        int num2 = sc.nextInt();

        System.out.println(" ");
        System.out.println("The sum of " + num1 + " to " + num2 + " is " + sum(num1, num2));
        System.out.println("The average is " + average(num1, num2, sum(num1, num2)));
    }

    public static int sum(int num1, int num2) {
        int sum = 0;
        int totalNum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static double average(int num1, int num2, int sum) {
        return sum / (num2 - num1 + 1.0);
    }
}
