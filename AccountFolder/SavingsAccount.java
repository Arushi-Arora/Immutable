public class SavingsAccount extends Account{
    private static final int roi=1;
    public double interestCalculation(int years){
        return (roi*getbalance()*years)/100;
    }
}
