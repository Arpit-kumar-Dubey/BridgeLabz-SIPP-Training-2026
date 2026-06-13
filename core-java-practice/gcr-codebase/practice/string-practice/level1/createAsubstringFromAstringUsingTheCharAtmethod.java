package practicesProgram;

import java.util.Scanner;

public class createAsubstringFromAstringUsingTheCharAtmethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String mySubstring = "";
        for (int i = start; i < end; i++) {
            mySubstring += text.charAt(i);
        }
        String builtInSubstring = text.substring(start, end);
        boolean result = true;
        if (mySubstring.length() != builtInSubstring.length()) {
            result = false;
        } else {
            for (int i = 0; i < mySubstring.length(); i++) {
                if (mySubstring.charAt(i) != builtInSubstring.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println("Substring using charAt(): " + mySubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + result);
        scanner.close();
    }
}