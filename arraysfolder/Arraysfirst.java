package Arrays;
import java.util.Scanner;

public class Arraysfirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = {12,23,45,232,35}; //direct assigning values toa arrays
        int[] arr2 = new int[5]; //suggesting size to the array
        //LHS occurs at run time and RHS occurs at runtime(dynamic memory allocation)

//        int[] ros;
//        ros = new int[5]; //this int[5] denotes
//        System.out.println(ros);

        //@@@@@@@@@@@@@@@non primitive type arrays@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //###################primitive type arrays###############################
        int[] arr5 =new int[5];
        arr5[0]=2;
        arr5[1]=657;
        arr5[2]=4534;
        arr5[3]=423;
        arr5[4]=346;
//        System.out.println(arr[2]);

        for(int i =0;i<arr.length; i++){
            arr5[i]=in.nextInt();
        }
        for (int j : arr5) { //for every element in the array print the element(j)
            System.out.println(j); //here j represents all the elements of the array

        }
    }
}
