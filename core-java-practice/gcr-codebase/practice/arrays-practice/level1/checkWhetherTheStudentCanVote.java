package practicesProgram;

import java.util.Scanner;

public class checkWhetherTheStudentCanVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++) {

            if (number[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (number[i] >= 18) {
                System.out.println("The student with the age " + number[i] + " can vote");
            }
            else {
                System.out.println("The student with the age " + number[i] + " cannot vote");
            }
        }
        scanner.close();
    }
}