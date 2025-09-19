package Lab05_array;

import java.util.Scanner;

public class NumberAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[5];
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {
            int j = i + 1;
            System.out.print("Enter integer " + j + ": ");
            numArray[i] = sc.nextInt();
            sum += numArray[i];
        }
        System.out.println(" ");
        System.out.print("Stored integers: [");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
            if (i != numArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("The average value is: " + sum);
    }
}
