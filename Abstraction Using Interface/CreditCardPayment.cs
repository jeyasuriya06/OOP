public class CreditCardPayment: Payment
{
    public void Pay(double amount)
    {
        Console.WriteLine($"Paid {amount} using Credit Card");
    }
}