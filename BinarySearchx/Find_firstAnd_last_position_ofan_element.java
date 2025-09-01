package BinarySearchx;

public class Find_firstAnd_last_position_ofan_element {
    public static void main(String[] args) {
        int[] arr={1,4,4,7,7,7,13,13,22,22,29,35};
        int target = 7;
//        int m= ceil(arr,target);
//        System.out.println(m);
    }
    //return the index of the smallest number >=target
    static int[] searchRange(int[] nums, int target){

        int[] ans={-1,-1};

        //of the target number is greater than the last number of the array then return -1.
        ans[0] = search(nums, target, true);
        if (ans[0]!=-1) ans[1] = search(nums, target, false);



        return ans;
    }
    //this function just return the index value of the target
    static int search(int[] nums, int target,boolean findStartIndex){
        int ans=-1;
        int start =0;
        int end= nums.length-1;

        while(start<=end){
            int mid = start+ (end-start)/2;

            if(target<nums[mid]){
                end=mid -1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                ans =mid;
                if (findStartIndex){
                    end = mid -1;
                }else start=mid+1;
            }
        }
        return ans;
    }
}
