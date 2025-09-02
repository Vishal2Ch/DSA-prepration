package BinarySearchx;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2,3};
        System.out.println(pivot(arr));
    }

    static int pivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
//            if (start>=mid){
//                end=arr[mid-1];
//            }
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start < mid && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            if (arr[mid]<arr[start]){
                end=mid -1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }static int pivotwithduplicates(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
//            if (start>=mid){
//                end=arr[mid-1];
//            }
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (start < mid && arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            //if elements at the start, end , middle are equals then skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //but what if the elements which we are skipping are the pivots so check them first if they are pivot or not
                if (arr[start]<arr[start+1]){
                    return arr[start];
                }
                start++;
                //check whether end is pivot or not
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<arr[end] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
                start=mid+1;
            }else end=mid-1;
        }
        return -1;
    }
}
