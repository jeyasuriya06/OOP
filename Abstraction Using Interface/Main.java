public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(5000);
    }

}
