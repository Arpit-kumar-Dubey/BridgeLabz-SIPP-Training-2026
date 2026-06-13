package practicesProgram;

import java.util.Scanner;

public class findTheBodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        String[][] result = new String[10][4];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight(kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter Height(cm): ");
            data[i][1] = scanner.nextDouble();
        }
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        System.out.printf("%-12s %-12s %-12s %-15s%n",
                "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-12s %-12s %-12s %-15s%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);
        }
        scanner.close();
    }
}