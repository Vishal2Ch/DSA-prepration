package BinarySearchx;

public class Floor_of_a_number {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,10,13,15,19,23,26,29,35};
        int target = 20;
        int m= ceil(arr,target);
        System.out.println(m);
    }
//return the index of the smallest number >=target
    static int ceil(int[] arr,int target){
        //of the target number is greater than the last number of the array then return -1.
        if(target>arr.length-1){
            return -1;
        }
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
        return end;
    }
}
