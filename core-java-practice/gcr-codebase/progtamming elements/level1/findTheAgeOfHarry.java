package programmingelements;

import java.util.Scanner;

public class findTheAgeOfHarry {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int currentYear= 2024;
        age = currentYear - age;
        System.out.println("The Current Age :"+age);
    }
}
