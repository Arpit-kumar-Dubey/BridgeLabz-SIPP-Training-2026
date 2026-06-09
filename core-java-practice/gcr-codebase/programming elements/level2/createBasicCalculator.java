package programmingelements;

import java.util.Scanner;

public class createBasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        String calculator = scanner.next();

        switch (calculator) {
            case "add":
                System.out.println("Addition = " + (number1 + number2));
                break;

            case "subtraction":
                System.out.println("Subtraction = " + (number1 - number2));
                break;

            case "multiplication":
                System.out.println("Multiplication = " + (number1 * number2));
                break;

            case "division":
                if (number2 != 0) {
                    System.out.println("Division = " + (number1 / number2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation!");
        }
    }
}