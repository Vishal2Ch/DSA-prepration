package Arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {12, 34, 56, 42, 12};

        // Call max method
        System.out.println("Max value: " + max(arr));

        // Optional: Use maxRange
        System.out.println("Max from index 1 to 3: " + maxRange(arr, 1, 3));
    }

    static int max(int[] arr1) {
        if (arr1.length == 0) {
            return -1;
        }

        int max2 = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max2) {
                max2 = arr1[i];
            }
        }

        return max2;
    }

    static int maxRange(int[] arr, int start, int end) {
        if (arr == null || start > end || start < 0 || end >= arr.length) {
            return -1;
        }

        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
