package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(facto(a));
    }

    static int facto(int n){
        int count =0;
        while(n>=1){
            int mul=0;
            count =n-1;
            mul += n*count;
            return mul;
        }
        return -1;
    }
}
