package J11_Inheritance.ATM;

public class Atm {

    private BankAccount[] accounts = {
            new BankAccount(1, "11", "Chan Tai Man", 12345),
            new PremiumBankAccount(2, "22", "Lee Siu Fai", 123453999)
    };
    private BankAccount loginAccount;

    public BankAccount getLoginAccount() {
        return loginAccount;
    }

    public BankAccount login(long accountNumber, String password) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber && account.getPassword().equals(password)) {
                System.out.println();
                System.out.println("Login success.");
                loginAccount = account;
                return loginAccount;
            }
        }
        System.out.println();
        System.out.println("Login failed. Please try again.");
        return null;
    }

    public void withdraw(double amount) {
        loginAccount.withdraw(amount);
    }

    public boolean requestLoan (double loan) {
       if (loan <=0){
           System.out.println("Loan Request failed!");
           return false;
       } else {
           System.out.print("Loan Request success! ");
           if (loginAccount instanceof PremiumBankAccount premiumBankAccount){
               premiumBankAccount.loan(loan);
           }
           return true;
       }
    }

    public void seeRecord(){
        loginAccount.seeRecords();
    }
}


