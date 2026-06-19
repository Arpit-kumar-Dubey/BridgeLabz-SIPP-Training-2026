package scenarioBased;

import java.io.FileReader;
import java.io.BufferedReader;

public class GroceryBillReader {
    public static void main(String[] args) {
        int lineCount = 0;
        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            br.close();
            fr.close();
            System.out.println("Total lines: " + lineCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}