class Account {
    protected balance: number = 0;

    deposit(amount: number): void {
        this.balance += amount;
    }
}

class SavingsAccount extends Account {
    addInterest(): void {
        this.balance += this.balance * 0.05;
    }
}
