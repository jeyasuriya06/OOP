const payments: Payment[] = [
    new CardPayment(),
    new UpiPayment()
];

for (const p of payments) {
    p.pay(1000);
}
