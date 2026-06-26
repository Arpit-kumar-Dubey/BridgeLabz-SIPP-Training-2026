package BankAccount;

//Encapsulation
public class BanKCustomer {
    int Bank_AccountNumber;
    String Bank_Holder;
    double Bank_Balance;
    static  int Bank_TotalAccountNumber;

    public BanKCustomer(String bank_Holder, int bank_AccountNumber, double bank_Balance) {
        Bank_Holder = bank_Holder;
        Bank_AccountNumber = bank_AccountNumber;
        Bank_Balance = bank_Balance;
    }

    @Override
    public String toString() {
        return "BanKCustomer{" +
                "Bank_AccountNumber=" + Bank_AccountNumber +
                ", Bank_Holder='" + Bank_Holder + '\'' +
                ", Bank_Balance=" + Bank_Balance +
                '}';
    }
}
