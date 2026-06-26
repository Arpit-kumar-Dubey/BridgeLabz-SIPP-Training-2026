package Bank;

public class BankMain {

    public static void display() {

        BankAccount b1 = new BankAccount("Arpit Dubey", 1001, 50000);
        BankAccount b2 = new BankAccount("Rahul Sharma", 1002, 35000);

        if (b1 instanceof BankAccount) {
            System.out.println(b1.toString());
        }

        System.out.println("--------------------------------");

        if (b2 instanceof BankAccount) {
            System.out.println(b2.toString());
        }

        System.out.println("--------------------------------");

        BankAccount.getTotalAccounts();
    }

    public static void main(String[] args) {
        display();
    }
}