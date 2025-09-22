package Recursion;

public class count_Zeros {
    public static void main(String[] args) {
//        countZ(2090039);
        System.out.println(countZ(7004340));
    }
    static int countZ(int n){
        return helper(n,0);
    }
    static int helper(int n,int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem ==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
