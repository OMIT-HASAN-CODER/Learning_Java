package Chapter_06.Bank;

public class SavingsAccount extends CheckingAccount {
    private final double interestRate;

    public SavingsAccount(int initialBalance, String accountNumber, double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }
}
