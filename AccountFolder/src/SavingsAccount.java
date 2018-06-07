public class SavingsAccount extends Account{
    private static final int roi=1;

    public SavingsAccount(int accountNumber, double balance, String name, String phoneNumber) {
        super(accountNumber, balance, name, phoneNumber);
    }

    public double interestCalculation(int years){
        return (roi*this.getBalance()*years)/100;
    }
}
