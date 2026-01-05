BankAccount account = new BankAccount();
account.Deposit(1000);
account.Withdraw(300);

Console.WriteLine(account.GetBalance());
