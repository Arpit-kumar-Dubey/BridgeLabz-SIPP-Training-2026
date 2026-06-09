package programmingelements;

import java.util.Scanner;

public class convertTheDistanceOfKilometersToMiles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float km = scanner.nextFloat();
        float miles= 1.6f;
        float covertKMtoMILES=0;
        covertKMtoMILES=km*miles;
        System.out.println("Kilometers to Miles="+covertKMtoMILES);

    }
}
