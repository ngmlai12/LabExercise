package Lab03;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("prime");
        } else if (num < 2) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("not prime");
                    break;
                } else {
                    System.out.println("prime");
                    break;
                }
            }
        }
    }
}
