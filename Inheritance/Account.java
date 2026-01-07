package Inheritance;

class Account {
    protected double balance;

    void deposit(double amount) {
        balance += amount;
    }
}

class SavingsAccount extends Account {
    void addInterest() {
        balance += balance * 0.05;
    }
}
