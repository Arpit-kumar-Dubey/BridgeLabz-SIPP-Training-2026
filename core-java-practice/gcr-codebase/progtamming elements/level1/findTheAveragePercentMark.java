package programmingelements;

import java.util.Scanner;

public class findTheAveragePercentMark {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int average =0;
        System.out.println("Physics marks =");
        int physics = scanner.nextInt();
        System.out.println("Chemistry marks =");
        int chemistry = scanner.nextInt();
        System.out.println("Math marks =");
        int maths = scanner.nextInt();

         average = (physics+chemistry+maths)*100/300;
        System.out.println("The Average Percent of Sam in PCM is:"+average);
    }
}
