public class Account {
    private int accountNumber;
    private double balance;
    public String name;
    private String phoneNumber;

    public Account(int accountNumber, double balance, String name, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void creditAmount(double amount) throws WithdrawAllMoneyException {
        if (amount > balance) {
            throw new WithdrawAllMoneyException();
        }
        this.balance = this.balance - amount;
    }

    public void debitAmount(double amount) {
        this.balance = this.balance + amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void changePhoneNumber(String newPhoneNumber) throws PhoneNumberCannotBeChangedException {
        throw new PhoneNumberCannotBeChangedException();
    }

    public String getAccountInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(this.name);
        sb.append(" Account Number: ");
        sb.append(this.accountNumber);
        sb.append(" Balance: ");
        sb.append(this.balance);
        sb.append(" Phone Number: ");
        sb.append(this.phoneNumber);
        return sb.toString();
    }
}
