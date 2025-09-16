package Lab01;

import java.util.*;

public class Exercise02_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please enter your height (in m): ");
        double height = scanner.nextDouble();


        System.out.printf("Please enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Your BMI is " + weight / (height * height));
    }
}
