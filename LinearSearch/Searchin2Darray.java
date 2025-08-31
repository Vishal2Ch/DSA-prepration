package LinearSearch;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int[][] arr={
                {12,354,56},
                {45,546,877,89},
                {33,56,78,43,23},
                {33,52}
        };

        int target=877;
        int[] ans= SearchFunc(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] SearchFunc(int[][] arr, int target){
        for (int row =0; row<arr.length ;row++){
            for (int col =0; col< arr[row].length; col++){
                if (arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
