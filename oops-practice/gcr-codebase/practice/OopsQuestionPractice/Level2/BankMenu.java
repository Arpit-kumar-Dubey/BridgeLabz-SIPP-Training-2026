package BankAccount;

import java.util.Scanner;

public class BankMenu {
    public void bankDisplay(){
        BankUtitlity bankUtitlity = new BankUtitlity();
        System.out.println("---------------------------------");

        while (true){

            System.out.println("WELCOME TO SBI BANK");
            System.out.println("---------------------------------");
            System.out.println("1.CREATE ACCOUNT\n2.DEPOSIT\n3.WITHDRAWL\n4.GET STATEMENT\n5.Count\n6.Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice==6)
                break;

            switch (choice){
                case 1:bankUtitlity.createAccount();
                break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    double amount =sc.nextDouble();
                    bankUtitlity.deposite(amount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                     amount =sc.nextDouble();
                     bankUtitlity.withdraw(amount);
                     break;
                case 4:
                    bankUtitlity.getStatement();
                    break;
                case 5:
                    bankUtitlity.countAccount();
                    break;

                default:
                    System.out.println("Invalid");
            }

        }

    }
}
