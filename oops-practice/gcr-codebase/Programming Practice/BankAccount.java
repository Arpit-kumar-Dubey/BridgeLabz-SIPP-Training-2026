package Bank;

public class BankAccount {

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    public String accountHolderName;
    public final int accountNumber;
    public double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;   // this keyword
        this.accountNumber = accountNumber;           // final variable
        this.balance = balance;

        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts = " + totalAccounts);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}