package Lab06_revision;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        double income = sc.nextDouble();
        System.out.println("The income tax payable is: $" + tax(income));
    }

    public static double tax(double income) {
        double tax = 0;
        if (income <= 20000) {
        } else if (income > 20000 && income <= 40000) {
            tax = (income - 20000) * 0.1;
        } else if (income > 40000 && income <= 60000) {
            tax = 20000 * 0.1
                    + (income - 40000) * 0.2;
        } else {
            tax = 20000 * 0.1
                    + 20000 * 0.2
                    + (income - 60000) * 0.3;
        }
        return tax;
    }


}
