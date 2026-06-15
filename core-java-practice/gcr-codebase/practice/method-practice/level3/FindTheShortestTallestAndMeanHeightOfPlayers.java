package practicesProgram;

import java.util.Random;

public class FindTheShortestTallestAndMeanHeightOfPlayers {
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        System.out.print("Generated Player Heights (in cms): ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(250 - 150 + 1) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n--- Results ---");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", calculateMean(heights));
    }
}