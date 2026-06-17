package practicesProgram;

public class ConsecutiveSensorReadings {
    public static boolean isIncreasing(int[] readings, int index) {
        if (index >= readings.length - 1) return true;
        if (readings[index] >= readings[index + 1]) return false;
        return isIncreasing(readings, index + 1);
    }
    public static void main(String[] args) {
        int[] readings1 = {12, 15, 18, 22, 30};
        int[] readings2 = {12, 15, 14, 22};
        System.out.println(isIncreasing(readings1, 0));
        System.out.println(isIncreasing(readings2, 0));
    }
}