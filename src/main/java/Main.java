import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        BankAccount base = new BankAccount();
        base.deposit(150);
        base.withdraw(10);
        System.out.println("Bank: " + base.getBalance());

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(200);
        savings.applyInterest();
        System.out.println("Savings: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount(50);
        checking.deposit(20);
        checking.withdraw(50);
        System.out.println("Checking: " + checking.getBalance());

        double richest = Math.max(savings.getBalance(), Math.max(checking.getBalance(), base.getBalance()));
        System.out.println("Richest: " + richest);
    }
}
