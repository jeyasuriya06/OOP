package Polymorphism;

import java.util.List;

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

public class Main {
    public static void main(String[] args) {
        List<Payment> payments = List.of(
            new CardPayment(),
            new UpiPayment()
        );

        for (Payment p: payments) {
            p.pay(1000);
        }
    }
}
