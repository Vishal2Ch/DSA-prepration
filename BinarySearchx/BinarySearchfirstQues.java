package BinarySearchx;

public class BinarySearchfirstQues {
    public static void main(String[] args) {
        int[] arr = {12, 14, 17, 21, 32, 38, 42, 47, 50};
        int poit = 38;
        System.out.println(binarySearch(arr,poit));
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;


        while(start<=end){
            int mid = start+ (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else return mid;
        }
        return -1;

    }

}
