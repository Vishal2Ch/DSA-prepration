package LinearSearch;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Search for 4 in the range of index[1,8]
        int[] arr = {13,32,445,657,45,335,56,57,34,35};
        int target= 57;
        System.out.println(linearSearch(arr,target,0,8));
    }
        static int linearSearch(int[] arr, int target, int start, int end){
            if (arr.length ==0){
                return -1;
            }

            for (int index = start; index < end; index++) {
                int element =arr[index];
                if(element==target){
                    return index;
                }

                
            }
            return -1;
        }

}
