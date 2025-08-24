import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("please enter any number including 3");
//        int n = in.nextInt();
        int n = 23443253;
        int count =0;

        while(n>0){
            int rem = n % 10;
//            System.out.println(rem);
            if (rem==3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
