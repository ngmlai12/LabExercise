package LabJ06_Object.Zoooo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a category: ");
        String category = sc.nextLine();

        Animal[] animalList = {
                new Animal("British Shorthair Cat", "cat"),
                new Animal("Persian Cat", "cat"),
                new Animal("Toy dog", "dog"),
                new Animal("Afador dog", "dog"),
                new Animal("Parrots bird", "bird")
        };

        for (int i = 0; i < animalList.length; i++) {
            if (category.equals(animalList[i].category)) {
                animalList[i].saySomething();
            }
        }

    }
}
