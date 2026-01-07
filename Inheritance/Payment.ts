abstract class Payment {
    abstract pay(amount: number): void;

    printReceipt(): void {
        console.log("Payment completed");
    }

}

class CardPayment extends Payment {
    pay(amount: number): void {
        console.log(`Paid ${amount} using card`);
    }
}

class UpiPayment extends Payment {
    pay(amount: number): void {
        console.log(`Paid ${amount} using UPI`);
    }
}

