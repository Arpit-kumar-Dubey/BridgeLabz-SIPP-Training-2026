package programmingelements;

import java.util.Scanner;

public class findHowManyPensEachStudent {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the total Number of Students");
        int totaNoOfStudents = scanner.nextInt();
        System.out.println("Enter the total Number of pens");
        int totalPens= scanner.nextInt();
        int equal = totalPens/totaNoOfStudents;
        int nonDistributed = totalPens%totaNoOfStudents;
        System.out.println(" Each student will get:"+equal+" The remaining non-distributed pens:"+nonDistributed);
    }
}
