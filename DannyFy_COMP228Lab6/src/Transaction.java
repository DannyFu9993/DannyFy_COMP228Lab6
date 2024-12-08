public class Transaction implements Runnable {
    private Account account;
    private double amount;

    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            account.withdraw(Math.abs(amount));
        }
    }
}
