public class BankAccount {
    private int accountNumber;
    private double balance;
    private static int numberOfActiveAccounts = 0;

    BankAccount(double balance) {
        this.accountNumber = (int) (Math.random() * 1000000000);
        this.balance = balance;
        numberOfActiveAccounts++;
    }
    public int getNumberOfActiveAccounts() {
        return numberOfActiveAccounts;
    }
    
    public void getAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

    public double getBalance() {
        return balance;
    }
}

