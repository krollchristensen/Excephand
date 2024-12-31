import java.util.logging.*;
//Udvidelse af opgave 5 med logging
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccountWithLogging {
    private static final Logger logger = Logger.getLogger(BankAccountWithLogging.class.getName());
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
        BankAccountWithLogging account = new BankAccountWithLogging();
        try {
            account.deposit(500);
            account.withdraw(600);
        } catch (IllegalArgumentException | InsufficientFundsException e) {
            logger.severe("Fejl: " + e.getMessage());
        }
    }
}
