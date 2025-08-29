package Arrays;

import java.util.Arrays;

public class swapnew {
    public static void main(String[] args) {
        int[] arr= {1,34,23,46,57};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(temp);
    }
}
