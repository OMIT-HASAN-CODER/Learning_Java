package Chapter_06.Bank;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000000, "12345");
        System.out.println("Initial balance: " + checkingAccount.getBalance());
        checkingAccount.deposit(20000);
        checkingAccount.withdraw(10000);

        SavingsAccount savingsAccount = new SavingsAccount(100000, "12345", 8);
        System.out.println("Initial balance:" + savingsAccount.getBalance());
        System.out.println(savingsAccount.calculateInterest());
        savingsAccount.deposit(15000);
        savingsAccount.withdraw(1000);
    }
}
