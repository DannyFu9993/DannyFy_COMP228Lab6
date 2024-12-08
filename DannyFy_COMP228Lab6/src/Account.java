public class Account {
    //Fields, how much money the user has
    public double balance;

    // Instantiate with input amount of money
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // adds money
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    }

    // removes money
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount);
        }
    }

    // check how much money you have
    public double getBalance() {
        return balance;
    }
}
