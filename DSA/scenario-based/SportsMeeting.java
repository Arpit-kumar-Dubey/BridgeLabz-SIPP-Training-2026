package Athelets;

import java.util.Arrays;

public class SportsMeeting {

    static void bubbleSort(int[] arr) {
        int swap = 0;
        boolean swapped;

        System.out.println("Bubble Sort");

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                System.out.println("Array is already sorted!! Best Case achieved");
                break;
            }
        }

        System.out.println("Total Swaps = " + swap);
    }

    // Insertion Sort
    static void inserationSort(int[] arr) {

        System.out.println("\nInsertion Sort");

        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void top(int[] arr) {

        if (arr.length < 3) {
            System.out.println("Not enough athletes for medals.");
            return;
        }

        int n = arr.length;

        System.out.println("------------------------------------");
        System.out.println("🥇 GOLD   : " + arr[n - 1]);
        System.out.println("🥈 SILVER : " + arr[n - 2]);
        System.out.println("🥉 BRONZE : " + arr[n - 3]);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        int[] bubble = scores.clone();
        int[] insertion = scores.clone();

        bubbleSort(bubble);

        inserationSort(insertion);

        top(insertion);
    }
}