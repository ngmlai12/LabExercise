package Lab03;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("The first 20 Fibonacci number are:");
        int fn = 1;
        System.out.print(fn);
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 20; i++) {
            int c = a + b;
            b = a;
            a = c;
            System.out.print(" " + c);
        }
    }
}
