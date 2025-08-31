package LinearSearch;

import java.util.Scanner;

public class FindMinNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {23,34,546,23,1,86,324,54,56};
        System.out.println(min(arr));
    }

//    static int min(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int count=arr[i];
//            if (arr[i]<arr[i+1]){
//                count=arr[i];
//            } else if (arr[i]>arr[i+1]) {
//                if (count>arr[i+1]){
//                    count=arr[i+1];
//                }
//            }
//            if (arr[i+1]==arr.length-1){
//                break;
//            }
//
//            System.out.println(count);
//        }
//
//        return -1;
//    }

    //////////////////////////////////////////////
    static int min(int[] arr) {
        int min = arr[0]; // Assume first element is minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if smaller element is found
            }
        }

        return min;
    }
}
