package Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);

        System.out.println(account.getBalance());
    }
}
