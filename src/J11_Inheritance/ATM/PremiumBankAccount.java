package J11_Inheritance.ATM;

public class PremiumBankAccount extends BankAccount {

    private double amountOfLoan = 0;

    public PremiumBankAccount(long accountNumber, String password, String holderName, double balance) {
        super(accountNumber, password, holderName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() >= amount && amount % 100 == 0) {
            records.add("Withdraw: -"+ String.format("$%.2f", amount));
            setBalance(getBalance() - amount);
            System.out.println("Cash Withdrawal success! Your available balance: " + String.format("%.2f", getBalance()));
            return true;
        } else {
            System.out.println("Invalid amount! Withdrawal failed!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "[Premium Account]\nAccount Holder: " + getHolderName()
                + "\nAccount Number: " + getAccountNumber()
                + "\nAccount Available Balance: " + String.format("$%.2f", getBalance())
                + "\nAccount Total Loan: " + String.format("%.2f", amountOfLoan);

    }

    public boolean loan(double loan) {
        records.add("loan: +"+ String.format("$%.2f", loan));
        setBalance(getBalance() + loan);
        amountOfLoan += loan;
        System.out.println("Your current loan: " + String.format("%.2f", loan)
                + ", available balance: " + String.format("%.2f", getBalance()));
        System.out.println();
        return true;
    }
}
