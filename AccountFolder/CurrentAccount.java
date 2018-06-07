public class CurrentAccount extends Account{
    private static final int roi=4;
    public double interestCalculation(int years){
        return (roi*getbalance()*years)/100;
    }

}
