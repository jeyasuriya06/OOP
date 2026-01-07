
class Account
{
    protected double balance;

    public void Deposit(double amount)
    {
        balance += amount;
    }
}

class SavingsAccount : Account
{
    public void AddInterest()
    {
        balance += balance * 0.05;
    }
}
