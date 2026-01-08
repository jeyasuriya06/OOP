class BankAccount {
    protected balance: number = 0;

    deposit(amount: number): void {
        this.balance += amount;
        this.logTransaction(amount);
    }

    protected logTransaction(amount: number): void {
        console.log(`Deposited: ${amount}`);
    }
}

class AuditAccount extends BankAccount {
    protected logTransaction(amount: number): void {
        console.log(`Audit log: ${amount}`);
    }
}
