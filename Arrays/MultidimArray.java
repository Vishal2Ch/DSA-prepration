package Arrays;
import java.util.Scanner;
public class MultidimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];
        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        //output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
//        int[][] arr2 = {
//                {1 ,2 ,3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int[][] anotherarr={
//                {1 ,2 ,3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };

        int[][] arrw = new int[3][3];
        System.out.println(arr.length);
        //input

        
    }
}
