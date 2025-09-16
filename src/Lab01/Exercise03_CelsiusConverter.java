package Lab01;

import java.util.*;

public class Exercise03_CelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("F: ");
        double tempF = scanner.nextDouble();

        double tempC = 5.0/9*(tempF-32);
        System.out.print("C: " + tempC);
    }
}
