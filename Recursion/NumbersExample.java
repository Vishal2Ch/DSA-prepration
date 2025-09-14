package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes a number and prints it.
        //print first five numbers
        print1(1);
//        print2(2);
//        print3(3);
//        print4(4);
//        print5(5);
//        print6(6);
    }

    static void print1(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        print1(n+1);
    }


}
