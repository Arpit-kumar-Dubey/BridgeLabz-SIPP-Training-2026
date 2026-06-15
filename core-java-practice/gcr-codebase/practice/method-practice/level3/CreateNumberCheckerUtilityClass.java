package practicesProgram;

import java.util.Scanner;

public class CreateNumberCheckerUtilityClass {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int[] storeDigits(int n) {
        int size = countDigits(n);
        int[] digits = new int[size];
        n = Math.abs(n);
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        if (digits[0] == 0) return false;
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }
    public static boolean isArmstrongNumber(int[] digits) {
        int power = digits.length;
        int sum = 0;
        int originalNumber = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        int[] digits = storeDigits(number);
        System.out.println("Digit Count: " + count);
        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
        scanner.close();
    }
}