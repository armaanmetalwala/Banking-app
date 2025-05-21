public class SavingsAccount extends BankAccount {
    private double interestRate = .05;

    public SavingsAccount() {
        super();
    }
    public void applyInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
    public double getInterestRate() {
        return interestRate;
    }
}
