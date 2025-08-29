package LinearSearch;
import java.util.Arrays;
import java.util.Scanner;
public class LinearMain {
    public static void main(String[] args) {
        int[] arr ={12,24,45,56,34,23,45,76,78,890,864,5,6,787,54,55,6,8,7};
        System.out.println("THis is the array you can choose any element you wish to get find out");
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number you want to find");
        int target=in.nextInt();
        int yello=LinearSearch(arr,target);
        System.out.println(yello);
    }

    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        int count =0;
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                count=arr[i];
                System.out.println("Your element was found in "+ i +" index");
                break;
            } else {
                System.out.println("need to find more");
            }
        }
        return count;
    }
}
