package Recursion;

public class fun {
    public static void main(String[] args) {
        fon(5);
        fonboth(7);
    }

    static void fon(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fon(n - 1);
    }
    static void fonboth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fon(n - 1);
        System.out.println(n);
    }


}
