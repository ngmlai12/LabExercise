package Lab04_method;

import java.util.*;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the positive integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        // Convert the number to a string
        String numStr = String.valueOf(num);

        // Compare characters from start and end
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
