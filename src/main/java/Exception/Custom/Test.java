package Exception.Custom;

public class Test{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);

        try {
            bankAccount.withdraw(12);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


