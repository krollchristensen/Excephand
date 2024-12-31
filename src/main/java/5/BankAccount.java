class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Beløbet kan ikke være negativt.");
        }
        balance += amount;
        System.out.println("Indsat: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Ikke nok penge på kontoen.");
        }
        balance -= amount;
        System.out.println("Hævet: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.deposit(500);
            account.withdraw(600);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }
}
