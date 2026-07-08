package StudentMarks;

import java.util.Scanner;

public class BubbleSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        BubbleSort obj = new BubbleSort();

        System.out.println("\nMarks Before Sorting:");
        obj.display(marks);

        obj.sort(marks);

        System.out.println("Marks After Sorting (Ascending Order):");
        obj.display(marks);

        sc.close();
    }
}