public class BankAccount {
    private double balance;

    /**
     * Constructor requiring we pass in a balance on instantiation
     * @param balance the balance the user provided when creating their bank acct
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    /**
     * Will take the depositAmount and add it to the existing balance
     * @param depositAmount the amount that should be added to the existing balance
     */
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
    

    /**
     * Will take the withDrawAmount and subtract it from the existing balance
     * @param withDrawAmount the amount that should be removed from the existing balance
     */
    public void withdraw(double withDrawAmount) {
        balance -= withDrawAmount;
    }

    public double getBalance() {
        return balance;
    }
}
