package practicesProgram;

import java.util.Scanner;

public class FindTheSumOfNnaturalNumbersUsingRecursiveMethod {
    public static int sumRecursion(int n) {
        if (n == 1) return 1;
        return n + sumRecursion(n - 1);
    }
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number. Please enter a number greater than 0.");
        } else {
            int recursiveResult = sumRecursion(n);
            int formulaResult = sumFormula(n);
            System.out.println("Sum using Recursion: " + recursiveResult);
            System.out.println("Sum using Formula: " + formulaResult);
            if (recursiveResult == formulaResult) {
                System.out.println("Success: Both computations yield the same correct result!");
            } else {
                System.out.println("Error: The results do not match.");
            }
        }
        scanner.close();
    }
}