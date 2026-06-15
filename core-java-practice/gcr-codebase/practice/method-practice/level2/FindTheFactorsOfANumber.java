package practicesProgram;

import java.util.Scanner;

public class FindTheFactorsOfANumber {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + calculateSum(factors));
        System.out.println("Product of factors: " + calculateProduct(factors));
        System.out.println("Sum of square of factors: " + (long) calculateSumOfSquares(factors));
        scanner.close();
    }
}