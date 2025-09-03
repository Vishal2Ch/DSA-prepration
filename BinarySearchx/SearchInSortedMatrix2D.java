package BinarySearchx;

import java.util.Arrays;

public class SearchInSortedMatrix2D {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=12;
        System.out.println(Arrays.toString(SearchinSortedMatrix(arr,target)));
    }
//this is written to search in the rows provided after cutting the space to two rows or just reducing the space
    //also search n the rows provided in the columns provided
    static int[] BinarySearch(int[][] matrix, int cstart, int cend, int target,int row){
        while(cstart<cend){
            int mid = cstart+(cend - cstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }if (matrix[row][mid]<target){
                cstart=mid+1;
            }else {
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] SearchinSortedMatrix(int[][] matrix, int target){
        int rows= matrix.length;
        int cols= matrix[0].length;

        if (rows==1){
            return BinarySearch(matrix,0,cols-1,target,0);
        }
        //run the loop till two rows are remaining
        int rStart=0;
        int rEnd = rows-1;
        int cMid = cols/2;

        //run the loop till two rows are remaining
        while (rStart<rEnd-1){//this conditons
            int mid = rStart + (rEnd - rStart)/2;

            if (matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target){
                rStart= mid;
            }else rEnd=mid;

        }

        //now we have two rows remaining
        //let us find that the target is in the two row or not
        if (matrix[rStart][rEnd]==target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart+1][rEnd]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in first half
        if (target <= matrix[rStart][cMid - 1]){
            return BinarySearch(matrix,0,cMid-1,target,rStart);
        }
        //search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]){
            return BinarySearch(matrix,cMid+1,cols-1,target,rStart);
        }
        //search in third half
        if (target <= matrix[rStart+1][cMid - 1]){
            return BinarySearch(matrix,0,cMid-1,target,rStart+1);
        }
        //search in forth half
        else {
            return BinarySearch(matrix,cMid+1,cols-1,target,rStart+1);
        }
    }
}
