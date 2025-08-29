package Arrays;
import java.util.Scanner;
public class reversethearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={12,23,564,656,34,57,23};
//        swap(arr,0,4);
        reverse(arr);
        System.out.println(arr);
    }

    static void reverse(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        }

}
