public class BankAccount {
    private double balance; //Encapsulation

    public BankAccount() {
        this.balance = 0; //class var
    }
    public void deposit(double amount) {
            balance += amount;
    }
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
