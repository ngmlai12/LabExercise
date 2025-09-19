package Lab06_revision;

import java.util.*;

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[3];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            int student = i + 1;
            do {
                System.out.print("Enter the mark (0-100) for student " + student + ": ");
                scores[i] = sc.nextInt();
                if (scores[i] < 0 || scores[i] > 100) {
                    System.out.println("Invalid input, try again...");
                }
            } while (scores[i] <= 0 || scores[i] >= 100);
            sum += scores[i];
        }

        System.out.println("The average score is:　" + sum / (scores.length + 0.0));
    }
}
