package practicesProgram;

import java.util.Scanner;

public class compareTwoStringsUsingTheCharAtMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean charAtResult = true;
        if (str1.length() != str2.length()) {
            charAtResult = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    charAtResult = false;
                    break;
                }
            }
        }
        boolean equalsResult = str1.equals(str2);
        System.out.println("Using charAt(): " + charAtResult);
        System.out.println("Using equals(): " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }
        scanner.close();
    }
}