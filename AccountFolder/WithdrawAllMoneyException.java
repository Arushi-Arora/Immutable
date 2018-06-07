public class WithdrawAllMoneyException extends Exception {
    public WithdrawAllMoneyException(){
        super("Money limit cant be excedeed");
    }
}
