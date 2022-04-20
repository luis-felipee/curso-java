package entities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double initalDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initalDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withDraw(double amount){
        balance -=  (amount + 5.00);
    }

    public String toString() {
       return "Account "
               + accountNumber
               + ", Holder: "
               + accountHolder
               + ", Balance: $ "
               + String.format("%.2f", balance);
    }
}
