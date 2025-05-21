public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() -amount >= -overdraftLimit) {
            deposit(-amount);
        }
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
