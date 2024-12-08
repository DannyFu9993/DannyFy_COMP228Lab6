public class AccountTest {


    public static void main(String[] args) {
        Account account = new Account(1000); // Initial balance

        // Create threads for transactions
        Thread t1 = new Thread(new Transaction(account, 1234));  // Deposit
        Thread t2 = new Thread(new Transaction(account, -456)); // Withdraw
        Thread t3 = new Thread(new Transaction(account, -123)); // Withdraw
        Thread t4 = new Thread(new Transaction(account, 123));  // Deposit
        Thread t5 = new Thread(new Transaction(account, -555)); // Withdraw
        Thread t6 = new Thread(new Transaction(account, 678));  // Deposit
        Thread t7 = new Thread(new Transaction(account, 1570));  // Deposit
        Thread t8 = new Thread(new Transaction(account, -123)); // Withdraw
        Thread t9 = new Thread(new Transaction(account, -623)); // Withdraw
        Thread t10 = new Thread(new Transaction(account, -679)); // Withdraw

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Display final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
