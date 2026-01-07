abstract class Payment
    {
        public abstract void Pay(double amount);

        public void PrintReceipt()
        {
            Console.WriteLine("Payment completed");
        }
    }

    class CardPayment : Payment
    {
        public override void Pay(double amount)
        {
            Console.WriteLine($"Paid {amount} using card");
        }
    }

    class UpiPayment : Payment
    {
        public override void Pay(double amount)
        {
            Console.WriteLine($"Paid {amount} using UPI");
        }
    }