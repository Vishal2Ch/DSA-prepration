import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number you wish to check");

//        while(n!=0){
//            int a = n%10;
//            int b = a*a*a;
//            a=n/10;
//            a=n%10;
//            int c = a*a*a;
////            a=n/10;
//            a=n%10;
//            int d = a*a*a;
//            int sum = b+c+d;
//
//            if(n==sum){
//                System.out.println("yes it is a palindrome");
//            }else {
//                System.out.println("No it is not a plaindrome");
//                return;
//            }
//            return;

//        int n= in.nextInt();
//        System.out.println(isArmstrong(n));
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
        }
        static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n %10;
            n = n/10;
            sum = sum + rem *rem *rem;
        }
        if (original==sum){
            return true;
        }else return false;
    }
}
