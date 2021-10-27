import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(5000, 234, "Lucas");
        System.out.println(myBankAccount.getBalance()); // 5000
        myBankAccount.withdraw(200); // Lucas withdrawed $200
        System.out.println(myBankAccount.getBalance()); // 4800
        myBankAccount.deposit(500); // Lucas deposited $500
        System.out.println(myBankAccount.getBalance()); // 5300
        System.out.println(myBankAccount.getAccountNumber()); // 234
        System.out.println(myBankAccount.getPrefferedName()); // Lucas
        myBankAccount.setPreferredName("Test");
        System.out.println(myBankAccount.getPrefferedName()); // Test
        System.out.println(myBankAccount); // Test: 5300
//        // Create a bank account with a balance of 0, the account number 101134, and the given name
//        BankAccount account = new BankAccount(0, 101134, name);
    }
}
