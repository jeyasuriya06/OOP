using System;
using System.Collections.Generic;

namespace Polymorphism
{
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

    class Program
    {
        static void Main()
        {
            List<Payment> payments = new List<Payment>
            {
                new CardPayment(),
                new UpiPayment()
            };

            foreach (Payment p in payments)
            {
                p.Pay(1000);
            }
        }
    }
}
