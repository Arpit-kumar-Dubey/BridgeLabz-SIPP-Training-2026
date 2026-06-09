package programmingelements;

import java.util.Scanner;

public class calculateTheProfitLossAndPercentage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Cost Price");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the Selling Price");
        double sellingPrice = scanner.nextDouble();

        if (sellingPrice > costPrice) {

            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit * 100) / costPrice;

            System.out.println("The profit is: " + profit);
            System.out.println("The profit percentage is: " + profitPercentage + "Percentage");

        } else if (costPrice > sellingPrice) {

            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss * 100) / costPrice;

            System.out.println("The loss is: " + loss);
            System.out.println("The loss percentage is: " + lossPercentage + "Percentage");

        } else {

            System.out.println("No profit no loss");
        }
    }
}