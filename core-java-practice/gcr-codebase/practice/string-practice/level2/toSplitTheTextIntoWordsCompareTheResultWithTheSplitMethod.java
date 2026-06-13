package practicesProgram;

import java.util.Scanner;

public class toSplitTheTextIntoWordsCompareTheResultWithTheSplitMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        int wordCount = 1;
        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                if (ch == ' ') {
                    wordCount++;
                }
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        int[] spaces = new int[wordCount - 1];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[spaceIndex++] = i;
            }
        }
        String[] myWords = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < wordCount - 1) {
                end = spaces[i];
            } else {
                end = length;
            }
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            myWords[i] = word;
            start = end + 1;
        }
        String[] splitWords = text.split(" ");
        boolean same = true;
        if (myWords.length != splitWords.length) {
            same = false;
        } else {
            for (int i = 0; i < myWords.length; i++) {
                if (!myWords[i].equals(splitWords[i])) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println("\nWords using charAt():");
        for (int i = 0; i < myWords.length; i++) {
            System.out.println(myWords[i]);
        }
        System.out.println("\nWords using split():");
        for (int i = 0; i < splitWords.length; i++) {
            System.out.println(splitWords[i]);
        }
        System.out.println("\nBoth results are same: " + same);
        scanner.close();
    }
}