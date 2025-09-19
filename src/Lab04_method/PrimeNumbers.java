package Lab04_method;

import Lab03.TestPrime;

public class PrimeNumbers {
    public static void main(String[] args) {
        TestPrime testPrime = new TestPrime();

        for (int i = 0; i <= 500; i++) {
            if (testPrime.isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }

//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
