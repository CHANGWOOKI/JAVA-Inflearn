package access.a;

public class BankAmountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(30000);
        account.withdraw(27000);
        account.withdraw(6000);
        System.out.println(account.getBalance());

    }
}
