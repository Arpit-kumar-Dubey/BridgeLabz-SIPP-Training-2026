package BankAccount;

import java.util.Scanner;

public class BankUtitlity {


    BanKCustomer banKCustomer;
    public void createAccount()

    {
        Scanner sc = new Scanner(System.in);
        int account_number = (int) (Math.random() * 900000) / 100000;
        System.out.println("Create Your Account");
        String name = sc.next();
        double balance = 50000;

        System.out.println("Account Created");
        BanKCustomer.Bank_TotalAccountNumber++;
    }



    public void deposite(double amount){
        banKCustomer = new BanKCustomer("Arpit",1,5000);
        BanKCustomer.Bank_TotalAccountNumber++;
        if (amount<0){
            System.out.println("Invalid Amount!!!");
        }
        else {
            banKCustomer.Bank_Balance+=amount;
            System.out.println("Deposite Amount is"+amount);
            System.out.println("Current Balance is"+banKCustomer.Bank_Balance);
        }
    }
    public void withdraw(double amount){
        if(amount>banKCustomer.Bank_Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            banKCustomer.Bank_Balance-=amount;
            System.out.println("Withdrawl Amount is"+amount);
            System.out.println("Bank Balnce is"+banKCustomer.Bank_Balance);
        }
    }
    public void getStatement(){
        System.out.println(banKCustomer.toString());
    }
    public void countAccount(){
      int count =  BanKCustomer.Bank_TotalAccountNumber;
    //  count++;
        System.out.println(count);
    }

}

