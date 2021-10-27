public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;
    public BankAccount(int balance2, int accountNumber2, String preferredName2) {
        balance = balance2;
        accountNumber = accountNumber2;
        preferredName = preferredName2;
    }
    public void withdraw(int x) {
        if (balance >= x) {
            balance -= x;
            System.out.println(preferredName+" withdrawed $"+x);
        }
    }
    public void deposit(int x) {
        balance += x;
        System.out.println(preferredName+" deposited $"+x);
    }
    public int getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getPrefferedName() {
        return preferredName;
    }
    public void setPreferredName(String preferredName2) {
        preferredName = preferredName2;
    }
    public String toString() {
        return preferredName+": $"+balance;
    }
}