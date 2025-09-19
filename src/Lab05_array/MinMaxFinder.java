package Lab05_array;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] myArray = {42, 57, 97, 23, 65, 87, 48, 61, 53, 26};

        int min = myArray[0];
        int max = myArray[0];

        System.out.print("Stored integers: [");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("min: " + min + ", max: " + max);

    }
}
