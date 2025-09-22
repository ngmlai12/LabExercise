package Lab06_revision;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the parallelogram width: ");
        int num = sc.nextInt();
        parallelogram(num);
        for (int i = 0; i <= num*2-2; i++) {
            System.out.print("=");
        }
        System.out.println(">");
        reversedParallelogram(num);
    }

    public static void parallelogram(int num) {
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reversedParallelogram(int num) {
        for (int i = 0; i < num; i++) {

            for (int j = num-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
