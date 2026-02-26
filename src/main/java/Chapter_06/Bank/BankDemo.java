package Chapter_06.Bank;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000000, "12345");
        System.out.println(checkingAccount.getBalance());
        checkingAccount.deposit(20000);
        checkingAccount.withdraw(10000);

        SavingsAccount savingsAccount = new SavingsAccount(100000, "12345", 15);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(15000);
        savingsAccount.withdraw(1000);

    }
}
