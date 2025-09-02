package BinarySearchx;

public class Mountain_array {
    public static void main(String[] args) {

    }
    public int peakIndexMountaininArray(int[] arr){
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end -start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in te decreasing part of the array
                //this may be the answer but look at the left
                end=mid;
            }else{
                start=mid+1; //because we know that mid+1 element is greater than the mid element hence we are ignoring the mid ele

            }
        }
        //both the start and end are pointing to wards the same number as the first check is operating in the descending order
        //and another check is pointing toward the aescending order so at the end they both point toward the same order
        return start;
    }
}
