package practicesProgram;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void divide(int num1, int num2) {

        if (num2 == 0)
            throw new InvalidDivisionException(num1, num2);

        System.out.println("Result = " + (num1 / num2));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator c = new Calculator();

        try {

            System.out.print("Enter First Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = scanner.nextInt();

            c.divide(num1, num2);

        }
        catch (InvalidDivisionException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Please Enter Numeric Values Only!");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}