package BinarySearchx;

public class SearchInMountain_array {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexMountaininArray(arr);
        int firstry = orderAgnostic(arr, target,0,peak);
        if (firstry==-1){
            return firstry;
        }
        //try to search in second half
        return orderAgnostic(arr, target, peak+1, arr.length-1);


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
    static int orderAgnostic(int[] arr, int target, int start, int end){


        boolean isAsc= arr[start]<arr[end];

        while(start<=end){
            int mid = start+ (end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc) {
                //{1,23,34,56,67,78,89,90} target=89
                //start       mid      end
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                //{90,87,76,65,54,43,32,21,11} target= 21
                //start        mid        end
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
