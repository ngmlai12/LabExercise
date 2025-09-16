package Lab02;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input the 1st number: ");
        int num1 = sc.nextInt();

        System.out.printf("Input the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.printf("Input the 3rd number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest: " + num3);
        }
    }
}
