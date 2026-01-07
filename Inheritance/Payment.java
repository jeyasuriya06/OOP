package Inheritance;

abstract class Payment {
    abstract void pay(double amount);

    void printReceipt() {
        System.out.println("Payment completed");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using card");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
