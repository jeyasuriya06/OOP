class BankAccount
{
    protected double balance;
    public virtual void Deposit(double amount)
    {
        balance += amount;
        LogTransaction(amount);
    }
    protected virtual void LogTransaction(double amount)
    {
        Console.WriteLine($"Deposited: {amount}");
    }
}
class AuditAccount : BankAccount
{
    protected override void LogTransaction(double amount)
    {
        Console.WriteLine($"Audit log: {amount}");
    }
}
