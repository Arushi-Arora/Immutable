public class CurrentAccount extends Account{
    private static final int roi=4;

    public CurrentAccount(int accountNumber, double balance, String name, String phoneNumber) {
        super(accountNumber, balance, name, phoneNumber);
    }

    public double interestCalculation(int years){
        return (roi*this.getBalance()*years)/100;
    }

}
