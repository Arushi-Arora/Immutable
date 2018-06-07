public class Accounts {

    public static void main(String[] args) throws WithdrawAllMoneyException, PhoneNumberCannotBeChangedException {
        Account savingsAccount=new SavingsAccount(1234,7655.69,"Arushi","9999999999");
        Account currentAccount=new CurrentAccount(1234,7655.69,"Aditi","0000000000");
        System.out.println(((SavingsAccount) savingsAccount).interestCalculation(4));
        System.out.println(((CurrentAccount) currentAccount).interestCalculation(4));
        System.out.println(savingsAccount.getAccountInfo());
        System.out.println();
        System.out.println(currentAccount.getAccountInfo());
       // savingsAccount.creditAmount(80000);                 //Exception will be thrown
       // currentAccount.changePhoneNumber("23145643334");                //Exception will be thrown
    }
}
