package FragileBaseClassProblem;

public class BankAccount {
    protected double balance;

    private TransactionLogger logger = new TransactionLogger();

    public void deposit(double amount) {
        balance += amount;
        logger.log(amount);
    }

    protected void logTransaction(double amount) {
        System.out.println("Deposited: " + amount);
    }
}

class AuditAccount extends BankAccount {

    @Override
    protected void logTransaction(double amount) {
        System.out.println("Audit log: " + amount);
    }
}

class TransactionLogger {
    void log(double amount) {
        System.out.println("Audit log: " + amount);
    }
}


