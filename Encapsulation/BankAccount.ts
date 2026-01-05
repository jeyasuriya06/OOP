class BankAccount {
    private balance: number = 0;

    deposit(amount: number): void {
    if (amount > 0) {
        this.balance += amount;
    }
    }

    withdraw(amount: number): void {
    if (amount > 0 && amount <= this.balance) {
        this.balance -= amount;
    }
    }

    getBalance(): number {
    return this.balance;
    }
}
