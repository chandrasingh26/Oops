package Exception.Custom;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;

    }

    public void withdraw(double amount) throws InsufficientFunds {
        if (amount > balance){
            throw new InsufficientFunds();
        }
        balance -= amount;
    }
}
