package J11_Inheritance.ATM;

import java.util.Scanner;

public class AtmUi {
    public static Scanner sc = new Scanner(System.in);
    public static Atm atm = new Atm();

    public static void main(String[] args) {

        while (true) {
            loginMenu();
            if (atm.getLoginAccount() == null) {
                System.out.print("");
            } else {
                while (true) {
                    mainMenu();
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        cashWithdrawalMenu();
                    }
                    if (choice == 2) {
                        requestLoanMenu();
                    }
                    if (choice == 3) {
                        recordMenu();
                    }
                    if (choice == 0) {
                        break;
                    }
                }
            }
        }
    }

    public static void loginMenu() {
        System.out.println("======ABC Bank ATM======");
        System.out.print("Account Number: ");
        long accountNumber = sc.nextLong();
        System.out.print("Password: ");
        String password = sc.next();
        atm.login(accountNumber, password);
    }

    public static void mainMenu() {
        System.out.println("======Main Menu======");
        System.out.println(atm.getLoginAccount());
        System.out.println();
        System.out.println("0.  Logout");
        System.out.println("1.  Withdraw Cash");
        System.out.println("2.  Request Loan");
        System.out.println("3.  Records");
        System.out.print("Select a feature: ");
    }

    public static void cashWithdrawalMenu() {
        System.out.println("======Cash Withdrawal======");
        System.out.print("Input an amount: $");
        atm.withdraw(sc.nextDouble());
        System.out.println();
        System.out.println();
    }

    public static void requestLoanMenu() {
        if (atm.getLoginAccount() instanceof PremiumBankAccount) {
            System.out.println("======Request Loan======");
            System.out.print("Input the  requested loan amount: $");
            atm.requestLoan(sc.nextDouble());
            System.out.println();
        } else {
            System.out.println("======Request Loan======");
            System.out.println();
            System.out.println("To get this function. You have to upgrade your bank account to Premium.");
            System.out.println();
            System.out.println();
        }

    }

    public static void recordMenu() {
        System.out.println("======Records======");
        atm.seeRecord();
        System.out.println();
        System.out.println();
    }

}
