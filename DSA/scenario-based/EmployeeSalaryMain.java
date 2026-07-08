package EmployeeSalaries;

import java.util.Scanner;

public class EmployeeSalaryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] salaries = new int[n];

        System.out.println("Enter employee salaries:");

        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        EmployeeSalaryMergeSort obj = new EmployeeSalaryMergeSort();

        System.out.println("\nBefore Sorting:");
        obj.display(salaries);

        obj.mergeSort(salaries, 0, n - 1);

        System.out.println("After Sorting:");
        obj.display(salaries);

        sc.close();
    }
}