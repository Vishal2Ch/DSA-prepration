package BinarySearchx;

public class CeilingOfaNum {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,10,13,15,19,23,26,29,35};
        int target = 19;
        int m= ceil(arr,target);
        System.out.println(m);
    }
//return the index of the smallest number <=target
    static int ceil(int[] arr,int target){
        int start =0;
        int end= arr.length-1;
        if (target > arr[end]) {
            return -1;  // No ceiling exists
        }
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid -1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else return mid;
        }
        return start;
    }
}
