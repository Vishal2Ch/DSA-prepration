package BinarySearchx;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={-12,-10,-7,-5,-1,0,3,5,9,10,14,17,20,35,48};
        int target= -10;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);

    }
    static int orderAgnostic(int[] arr, int target){
        int start=0;
        int end= arr.length-1;

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
