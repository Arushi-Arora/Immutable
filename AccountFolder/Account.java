public class Account {
    private int accountNumber;
    private double balance;
    public String name;
    private String phoneNumber;
    public void creditAmount(double amount) throws WithdrawAllMoneyException {
        if(amount>balance){
            throw new WithdrawAllMoneyException();
        }
        this.balance=this.balance-amount;
    }
    public void debitAmount(double amount){
        this.balance=this.balance+amount;
    }
    public double getbalance(){
        return this.balance;
    }
    public String getname(){
        return this.name;
    }
}
