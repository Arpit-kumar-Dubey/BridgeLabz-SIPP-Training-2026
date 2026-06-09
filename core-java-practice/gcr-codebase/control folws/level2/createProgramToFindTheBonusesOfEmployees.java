package controlOverFlow;

import java.util.Scanner;

public class createProgramToFindTheBonusesOfEmployees {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Years of Service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus Amount = " + bonus);
    }
}