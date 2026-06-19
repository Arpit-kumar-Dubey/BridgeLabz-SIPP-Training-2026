package scenarioBased;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the category (e.g., Food, Travel, Shopping):");
        String category = sc.nextLine();
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();
        try {
            FileWriter fw = new FileWriter("expenses.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(category + " - " + amount);
            pw.close();
            bw.close();
            fw.close();
            System.out.println("Expense logged successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}