public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        BankAccount account3 = new BankAccount(3000);
        account1.getAccountNumber();
        System.out.println(account1.getBalance());
        account2.getAccountNumber();
        System.out.println(account2.getBalance());
        account3.getAccountNumber();
        System.out.println(account3.getBalance());
    }
}