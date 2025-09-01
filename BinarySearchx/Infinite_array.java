package BinarySearchx;

public class Infinite_array {
    public static void main(String[] args) {
        int [] arr={2,6,23,25,27,48,86,80,92,976,1000};
        int target=48;
        int m = ans(arr,target);
        System.out.println(m);
    }

    static int ans(int[] arr, int target){
        //first assign start to 0;
        //and assign end to 1
        //later double down the range of end so at each step it covers twice the assigned array
        int start=0;
        int end =1;

        //condition for target to lie in the range
        while(target>arr[end]){
            int temp=end+1;
            //newend = perviousend + sizeofbox*2;
            //(end -start+1)*2  [2- 0+1]*2 [
            end= end +(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[] arr,int target, int start, int end){


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
