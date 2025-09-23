package J11_Inheritance.ATM;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private long accountNumber;
    private String password;
    private String holderName;
    private double balance;
    protected List<String> records =  new ArrayList<>();

    public BankAccount(long accountNumber, String password, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.holderName = holderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount && amount <= 10000 && amount % 100 == 0) {
            records.add("Withdraw: -" + String.format("$%.2f", amount));
            balance -= amount;
            System.out.println("Cash Withdrawal success! Your available balance: " + String.format("$%.2f", balance));
            return true;
        } else {
            System.out.println("Invalid amount! Withdrawal failed!");
            return false;
        }
    }

    public String toString() {
        return "[Normal Account]\nAccount Holder: " + holderName
                + "\nAccount Number: " + accountNumber
                + "\nAccount Available Balance: " + String.format("$%.2f", balance);
    }

    public void seeRecords() {
        if (records.isEmpty()) {
            System.out.println("No records found!");
        } else {
            for (String record : records) {
                System.out.println(record);
            }

        }
    }


}
