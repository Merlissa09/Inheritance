public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double withDrawAmount) {
        if(getBalance() - withDrawAmount  >= 100){
            super.withdraw(withDrawAmount);
        } else {
            System.out.println("Unable to withdraw - balance would be less than 100");
        }

    }
    
}
