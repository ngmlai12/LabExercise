package Lab06_revision;

import java.util.*;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        surfaceArea(radius);
        volume(radius);
    }

    public static void surfaceArea(double radius) {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface area = " + area);
    }

    public static void volume(double radius) {
        double volume = 4.0 / 3 * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume = " + volume);
    }

}
