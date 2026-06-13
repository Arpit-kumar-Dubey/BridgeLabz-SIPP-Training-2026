package practicesProgram;

import java.util.Scanner;

public class findAndReturnTheLengthOfAstringWithoutUsingTheLengthMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        System.out.println("Length without using length() method: " + count);
        System.out.println("Length using built-in length() method: " + str.length());
        scanner.close();
    }
}