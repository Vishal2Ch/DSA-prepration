package BubbleSort;

import java.util.Arrays;

public class BubbleSirt {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //each step the max item wil comae at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
                
            }
            if (!swapped){
                break;
            }
        }
    }
}
